<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${msg}
<br><br>
<form action="./login"  method="post">
User Id:<input type="text" name="userId" required><br>
Password:<input type="password" name="password" required>
<br><br>
<input type="submit" value="login">
</form>
</body>
</html>