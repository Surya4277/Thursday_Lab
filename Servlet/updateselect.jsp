<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
.button{
width:500px;
margin-left:500px;
}
.button#bttn1{
background-color:green;
}
.button#bttn2{
background-color:orange;
}
.button#bttn3{
background-color:red;
}
.button#bttn4{
background-color:purple;
}
.button#bttn5{
background-color:yellow;
}
</style>
<body>
<h1 style="color:white;background-color:red;text-align:center">Update Your Data</h1>
<h2 style="color:white;background-color:Black">Choose The Button To Make Changes</h2>
<a href="updatefirstname.jsp"><button class="button" id="bttn1"><h3>Change First Name</h3></button></a><br/><br/>
<a href="updatemidname.jsp"><button class="button" id="bttn2"><h3> Change Middle Name</h3></button></a><br/><br/>
<a href="updatelastname.jsp"><button class="button" id="bttn3"><h3> Change Last Name</h3></button></a><br/><br/>
<a href="updateclass.jsp"><button class="button" id="bttn4"> <h3>Change Class</h3></button></a><br/><br/>
<a href="updatedivision.jsp"><button class="button" id="bttn5"><h3>Change Division</h3></button></a>
</body>
</html>