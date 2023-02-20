<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="beige">
	<form:form action="details" modelAttribute="bloodgroups">
		Name: <form:input path="name" required="true"/><br>
		Email: <form:input path="email"/><br>
		Organization: <form:input path="organization"/>
		<form:errors path="organization" cssClass="error"/><br>
		Blood Group:<form:input path="bloodGroup"/><br>
		<input type="Submit" value="Submit">
	</form:form>
</body>
</html>