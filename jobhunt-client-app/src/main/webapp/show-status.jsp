<%@page import="com.jobhunt.model.Job"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor" crossorigin="anonymous">
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Jobs</title>
</head>
<body>
 <% List<Job> jobList = (List<Job>)request.getAttribute("availableJobs");  %>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark mb-5">
		<div class="container">
			<div class="navbar-brand mx-auto">
				<h1>Job | Details</h1>
			</div>
		</div>
	</nav>
	<div class="mx-5 my-5">
		<table class="table table-hover">
			<thead>
				<tr class="table-dark">
					<td>Company Name</td>
					<td>Job Profile</td>
					<td>Profile Description</td>
					<td>Experience</td>
					<td>Salary</td>
					<td>Company Url</td>
					<td>Status</td>
				</tr>
			</thead>
			<tbody>
				<%
					for(Job job : jobList){
						out.print("<tr>");
						out.print("<td>"+job.getCompanyName()+"</td>");
						out.print("<td>"+job.getDesignation()+"</td>");
						out.print("<td>"+job.getProfileDesc()+"</td>");
						out.print("<td>"+job.getExperience()+"</td>");
						out.print("<td>"+job.getSalary()+"</td>");
						out.print("<td><a href='https://"+job.getCompanyUrl()+"'>"+job.getCompanyUrl()+"</a></td>");
						out.print("<td>"+job.getStatus()+"</td>");
						out.print("</tr>");
					}
				%>
			</tbody>
		</table>
	</div>
	

</body>
</html>