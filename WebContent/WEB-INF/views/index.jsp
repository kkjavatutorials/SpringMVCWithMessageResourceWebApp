<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style type="text/css">
.error{
color:red;
}
</style>
</head>
<body>
	<form:form action="/SpringMVCWithMessageResourceWebApp/register" method="post"
		modelAttribute="user">

		<table>
			<tr>
				<td>User Name</td>
				<td><form:input path="userName" /></td>
				<td><form:errors path="userName" cssClass="error"/></td>
			</tr>
			<tr>
				<td>Select Gender</td>
				<td>
				<form:radiobuttons path="gender" items="${genderList}"/>
				</td>
				<td><form:errors path="gender" cssClass="error"/></td>
				
			</tr>

			<tr>
				<td>Enter Phone No</td>
				<td><form:input path="phone" /></td>
				<td><form:errors path="phone" cssClass="error"/></td>
			</tr>

			<tr>
				<td>Select Location</td>
				<td>
				
				<form:select path="location">
				<form:options items="${locationsList}"/>
				</form:select>
			</td>
			<td><form:errors path="location" cssClass="error"/></td>
			</tr>

			<tr>
				<td><input type="submit" value="Submit"></td>
			</tr>
		</table>
	</form:form>

</body>
</html>