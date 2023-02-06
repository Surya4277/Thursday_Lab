<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  <%@page import="java.sql.DriverManager"%>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="java.io.IOException"%>
  <%@page import="java.sql.Connection"%> 
  <%@page import ="java.sql.PreparedStatement" %> 
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table,td{
border:2px solid black;
border-collapse:collapse;
padding:10px

}
</style>
</head>
<body>
<form action="" method="">
<p>Enter Roll Number To Fetch The Data</p>
<input type="number" name="rollnno"/><br/>
<input type="submit" value="Fetch">
<input type="reset" value="Reset">
<a href="Student.jsp"><input type="submit" value="Go To Home Page"></a><br/><br/>
</form>
<table>
<tr style="background-color:skyblue">
<td>Roll No</td>
<td>First Name</td>
<td>Middle name</td>
<td>SurName</td>
<td>Class</td>
<td>Division</td>
</tr>
<%
try {
	String quer="select * from stud where roll_no=?";
	String rollno;
	rollno=request.getParameter("rollnno");
	int i= Integer.parseInt(rollno);
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin");
	PreparedStatement st=con.prepareStatement(quer);
	st.setString(1, rollno);
	ResultSet rs=st.executeQuery();
	while(rs.next()) {
%>
<tr>
<td><%=rs.getString("roll_no") %></td>
<td><%=rs.getString("stud_firstname") %></td>
<td><%=rs.getString("stud_midname") %></td>
<td><%=rs.getString("stud_surname") %></td>
<td><%=rs.getString("class") %></td>
<td><%=rs.getString("division") %></td>
</tr>
<%
}

con.close();
}
catch (Exception e) 
{
   e.printStackTrace();
}
%>
</table>
</body>
</html>