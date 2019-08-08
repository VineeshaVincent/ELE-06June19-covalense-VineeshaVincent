<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Homepage</title>
 <link rel="stylesheet" href="./homePage.css">
 <link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
 <script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>
</head>
<body>
<div class="topnav">
  <a class="active" href="./logout" >Logout</a>
  <a href="#edit">Edit</a>
  <div class="search-container">
    <form action="./validator/validate/employee/search" method="get">
      <input type="text" placeholder="Enter the id or name" name="search">
    <button class="primary" type="submit" >search</button>
    </form>
    </div>
    </div>
    <div>
    	${msg2}
    <div>
		        id	:	${employeeInfoBean.id}<br>
				name	:	${employeeInfoBean.name}<br>
				age	:	${employeeInfoBean.age}<br>
				gender	:	${employeeInfoBean.gender}<br>
				salary	:	${employeeInfoBean.salary}<br>
				phone	:	${employeeInfoBean.phone}<br>
				joining_date	:	${employeeInfoBean.joining_date}<br>
				account_number	:	${employeeInfoBean.account_number}<br>
				email	:	${employeeInfoBean.email}<br>
				designation	:	${employeeInfoBean.designation}<br>
				dob	:	${employeeInfoBean.dob}<br>
				dept_id	:	${employeeInfoBean.dept_id}<br>
				mngr_id	:	${employeeInfoBean.mngr_id}<br>
			</div>	
  </div>
</body>
</html>