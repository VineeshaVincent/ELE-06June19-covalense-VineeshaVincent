<!DOCTYPE html>
<%@page import="com.covalense.emp.dto.EmployeeInfoBean"%>
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
     <div style="color:red">{msg2}</div>
 
				
				id:${employeeInfoBean.id}<br>
				name:${employeeInfoBean.name}<br>
				age:${employeeInfoBean.age}<br>
				gender:${employeeInfoBean.gender}<br>
				salary:${employeeInfoBean.salary}<br>
				phone:${employeeInfoBean.phone}<br>
				joining_date:${employeeInfoBean.joining_date}<br>
				account_number:${employeeInfoBean.account_number}<br>
				email:${employeeInfoBean.email}<br>
				designation:${employeeInfoBean.designation}<br>
				dob:${employeeInfoBean.dob}<br>
				dept_id:${employeeInfoBean.dept_id}<br>
				mngr_id:${employeeInfoBean.mngr_id}<br>
				password:${employeeInfoBean.password}<br>
				
				
				
  </div>

</body>
</html>