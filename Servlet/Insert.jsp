<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1 style="color:white;background-color:purple;text-align:center">Enter Student Detail</h1>
<form action="Insertt" method="post">
<label>Enter Student Roll No: </label>
<input type="number" placeholder="Enter Your Roll Number" name="roll"/><br/><br/>
<label>Enter Student Name: </label>
<input type="text" placeholder="Enter Your Name" name="firstname"/><br/><br/>
<label>Enter Middle Name: </label>
<input type="text" placeholder="Enter Middle Name" name="midname"><br/><br/>
<label>Enter Student Surname: </label>
<input type="text" placeholder="Enter SurName" name="surname"><br/><br/>
<label>Enter Class: </label>
<input type="text" placeholder="Enter Your Class" name="class"/><br/><br/>
<label>Enter Divsion: </label>
<input type="text" placeholder="Enter Your Division" name="div"/><br/><br/>
<input type="submit" value="Submit">
<input type="Reset" value="Reset"/>
</form>

</body>
</html>