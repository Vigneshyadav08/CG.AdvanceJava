<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
</head>
<body>
<form action="submit" method="post" onsubmit="func()">
Name: <input type = "text" name = "name"/><br><br>
Email: <input type = "text" name = "email"/><br><br>
Age: <input type = "number" name = "age"/><br><br>
City: <input type = "text" name = "city"/><br><br>
<input type = "submit" value = "Register"/>
<input type = "reset" value = "Reset"/>
</form>

<script>
function func()
{
	alert("Submit successfully");	
}
</script>
</body>
</html>