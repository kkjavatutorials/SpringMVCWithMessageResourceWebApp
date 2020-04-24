<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>welcome Page</title>
</head>
<body>
	<table align="center" border="2px">
	<caption>You have registered with Following info:::</caption>
		<tr>
			<td>User Name</td>
			<td>${user.userName}</td>
		</tr>

		<tr>
			<td>Gender</td>
			<td>${user.gender}</td>
		</tr>
		<tr>
			<td>Selected Location</td>
			<td>${user.location}</td>
		</tr>

		<tr>
			<td>Phone No</td>
			<td>${user.phone}</td>
		</tr>

	</table>
</body>
</html>