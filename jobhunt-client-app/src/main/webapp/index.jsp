<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Action Page</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-brand">
			<h1>Actions to Filter Data</h1>
		</div>
	</div>
</nav>
<a class="btn btn-success btn-lg col-6 my-2 d-grid mx-auto my-5" href="/show-all">ShowAll</a>
<form action="/show-status">
	<select class="btn btn-secondary btn-lg col-6 my-2 d-grid mx-auto" name="status">
		<option>Available</option>
		<option>NotAvailable</option>
	</select>
	<button class="btn btn-success btn-lg col-6 my-2 d-grid mx-auto my-5" type="submit">Submit</button>
</form>
</body>
</html>