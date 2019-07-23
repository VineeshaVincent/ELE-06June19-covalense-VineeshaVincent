<!DOCTYPE html>
<%@page import="com.covalense.emp.bean.EmployeeInfoBean"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
 <link rel="stylesheet" href="./home.css">
</head>
<body>
<div class="topnav">
  <a class="active" href="./logout" >Logout</a>
  <a href="#edit">Edit</a>
 
  <div class="search-container">
 
    <form action="./search" method="get">
      <input type="text" placeholder="Enter the id or name" name="search">
      <button type="submit"><i class="fa fa-search"></i></button>
      
    </form>
     </div>
    </div>
     <div>
     <div style="color:red"><%=request.getParameter("msg2") %></div>
    <%
				
				EmployeeInfoBean emps= (EmployeeInfoBean)request.getAttribute("bean"); %>
			  	<br><%="id:"+emps.getId()%>
				<br><%="name :" +emps.getName() %>
			 	<br><%="age: "+emps.getAge() %>
			  	<br><%="email: "+emps.getEmail()%>
			  	<br><%="phone: "+emps.getPhone() %>
			 	<br><%= "dob: "+emps.getDob()%>
			 	<br><%="salary: "+emps.getSalary() %>
				<br><%="Password: "+emps.getPassword() %>
			 	<br><%= "Designation: "+emps.getDesignation()%>
				<br><%="dob: "+emps.getDob() %>
				<br><%="Dept_id: "+emps.getDept_id() %>
				<br><%="Mngr_id: "+emps.getMngr_id() %>
			  	<br><%="Account_number: "+emps.getAccount_number()%> 
  </div>

</body>
</html>