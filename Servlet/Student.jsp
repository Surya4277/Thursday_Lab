<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student</title>
<style>
.body{
background-image:url('imagess/studbackground.jpg');
}
.button{
width:1000px;
height:50px;
margin-left:250px;
margin-top:50px;
}
.button#btn1{
background-color:green;
}
.button#btn2{
background-color:orange;
}
.button#btn3{
background-color:red;
}
.button#btn4{
background-color:purple;
}
.button#btn5{
background-color:yellow;
}
</style>
</head>
<body>
<h1 style="color:white;background-color:blue;text-align:center">Student Management System</h1>
<a href="Insert.jsp"><button class="button" id="btn1"><h2>Insert New Student Data</h2></h4></button></a><br/><br/>
<a href="updateselect.jsp"><button class="button" id="btn2"><h2>Update Student Data</h2></button></a><br/><br/>
<a href="deletedata.jsp"><button class="button" id="btn3"><h2>Delete Student Data</h2></button></a><br/><br/>
<a href="showdata.jsp"><button class="button" id="btn4"><h2>Show All Data</h2></button></a>
<a href="fetchdata.jsp"><button class="button" id="btn5"><h2>Fetch Student Data</h2></button></a>

</body>
</html>