<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
<style type="text/css">
.error {
	color: red;
}
</style>
</head>
<body>
	<h1>Login</h1>
	
	<form:form action="home" method="post" commandName="user">
		Username: <form:input path="username" /><span class="error"><c:out value="${usernameError}"></c:out></span><br>
		Password: <form:password path="password" /><span class="error"><c:out value="${passwordError}"></c:out></span><br>
		<input type="submit" value="Submit" />
	</form:form>
	
</body>
</html>