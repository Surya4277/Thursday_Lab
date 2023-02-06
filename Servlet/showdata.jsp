<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="java.sql.DriverManager"%>
  <%@page import="java.sql.ResultSet"%>
  <%@page import="java.io.IOException"%>
  <%@page import="java.sql.Connection"%>  
 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>All The Data</title>
<style>
table,td{
border:2px solid black;
border-collapse:collapse;
padding:10px

}
</style>
</head>
<body>
<h1 style="color:white;background-color:purple;text-align:center">All The Data</h1>
<table class="tababhi" style="width:600px">
<tr style="background-color:skyblue">
<td>Roll No</td>
<td>First Name</td>
<td>Middle name</td>
<td>SurName</td>
<td>Class</td>
<td>Division</td>
</tr>

<%
try 
{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "admin");
java.sql.Statement st=con.createStatement();
ResultSet rs=((java.sql.Statement) st).executeQuery("select * from stud");
while(rs.next()){
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