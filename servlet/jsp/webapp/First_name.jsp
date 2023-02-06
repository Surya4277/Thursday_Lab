<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First_Name Page</title>
</head>
<body>
<h1 style="color:white;background-color:red;text-align:center">Update Your First Name</h1>
<form action="First_name" method="post">
<label>Enter Student Roll No:</label>
<input type="number" placeholder="Enter Roll No." name="roll"/><br/>
<label>Enter First Name To Update: </label>
<input type="text" placeholder="Enter First Nmae" name="firstname"/><br/>
<input type="submit" value="submit"/>
<input type="Reset" value="Reset"/>
</form>
</body>
</html>