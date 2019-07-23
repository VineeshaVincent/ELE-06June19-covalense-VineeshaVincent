<%@page import="java.util.Date" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
Current Date and Time is:
<%
String currentDateTime=new Date().toString();
%>
<br>
<span style="color:green;"><%=currentDateTime %></span>
</body>
</html>