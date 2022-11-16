<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User | Registration</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-5">
		<div class="container">
			<div class="navbar-brand mx-auto">
				<h1>Register</h1>
			</div>
		</div>
	</nav>
	<div class="bg-danger">
		<h2>${errorMsg}</h2>	
	</div>
	<div class="container">
		<div class="p-5 bg-secondary">
			<div>
				<form action="/register-user" method="post">
					<div class="col-6 my-2 d-grid gap-2 mx-auto">
						<label class="form-label fs-4 text-light">User Name</label>
						<input class="form-control" type="text" name="userName" required>
					</div>
					<div class="col-6 my-2 d-grid gap-2 mx-auto">
						<label class="form-label fs-4 text-light">Email</label>
						<input class="form-control" type="text" name="email" required>
					</div>
					<div class="col-6 my-2 d-grid gap-2 mx-auto py-2">
						<label class="form-label fs-4 text-light">Password</label>
						<input class="form-control" type="password" name="password" required>
					</div>
					<div class="col-6 my-2 d-grid gap-2 mx-auto py-2">
						<button class="btn btn-primary" type="submit">Register</button>
					</div>
				</form>
			</div>
			<div>
				<a class="btn btn-success col-6 my-2 d-grid gap-2 mx-auto py-2" href="/login.jsp">Login</a>
			</div>
		</div>
	</div>
</body>
</html>