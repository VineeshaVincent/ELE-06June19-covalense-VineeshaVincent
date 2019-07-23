<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
11111111111111111111111111
<br>
<jsp:include page="index.html"/>
<br>
222222222222222222222222222
<jsp:include page="currentDate"/>
<br>
33333333333333333333333333
<jsp:include page="currentDate?fname=latha"></jsp:include>
<br>
44444444444444444444444444444
<jsp:include page="currentDate" >
<jsp:param name="fname" value="latha"/>
<jsp:param name="lname" value="kk"/>
</jsp:include>
<br>
555555555555555555555555555555
<br>

<jsp:include page="currentDateJSP"/>

<br>
6666666666666666666666666666666
<br>
<jsp:include page="MyFirstJSP.jsp"/>
</body>
</html>