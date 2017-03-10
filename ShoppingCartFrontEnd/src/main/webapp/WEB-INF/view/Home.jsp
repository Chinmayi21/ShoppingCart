<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@ taglib prefix="c"
	uri="http://java.sun.com/jsp/jstl/core"%>
<title>Shop Easy! </title>
</head>
<body>
	<h2>
		<center>Shop Easy !</center>
	</h2>
	<center>${msg}</center>

	<center>${role}</center>

	<center>${successMessage }</center>

	<center>${errorMessage }</center>

	${loginMessage }
	<hr>
	<jsp:include page="CategoryMenu.jsp"></jsp:include>
	
	<jsp:include page= "Admin/AdminHome.jsp"></jsp:include>

	<c:if test="${empty loginMessage}">
		<a href="Login">Login</a>
	</c:if>

	<c:if test="${not empty loginMessage}">
		<a href="Logout">Logout</a>
		<br>
	</c:if>


	<a href="Register">Register</a>
	<br>


	<c:if test="${isUserClickedRegistration==true }">
		<jsp:include page="Registration.jsp"></jsp:include>
	</c:if>

</body>
</html>