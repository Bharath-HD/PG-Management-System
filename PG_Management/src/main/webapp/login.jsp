<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>PG Management Login</title>
</head>
<body>
<h2>Admin Login</h2>
<form action="login" method="post">
username:
<input type="text"  name="username" required>
<br><br>
password:
<input type="password" name="password" required>
<br><br>
<input type="submit" value="login">
</form>

</body>
</html>