<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
<link rel="stylesheet" href="./login.css">
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
	<div class="wrapper">
		<div style="color:red;margin-left:720px"><%=request.getParameter("msg") %></div>
		
		<form class="form-signin" action="./formSubmit" method="post">
			<h2 class="form-signin-heading">
				<b>Please login</b>
			</h2>
			<label for="name">Employee Id</label> <input type="text"
				class="form-control" name="eid" placeholder="Employee id" /> <label
				for="name">password</label> <input type="password"
				class="form-control" name="password" placeholder="Password" />
			<!-- <label for="name">confirm password</label>
                  <input type="password" class="form-control" name="password" placeholder="confirm Password" />   -->
			<button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>


			<button type="button" onClick="location.href='createaccount.html'"
				style="width: 150px; height: 40px;">create account</button>

			<button style="width: 150px; height: 40px;">forgot
				password?</button>

		</form>
	</div>

</body>
</html>