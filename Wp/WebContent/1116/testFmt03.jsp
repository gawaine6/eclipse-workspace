<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<fmt:bundle basename = "resourceBundle.message">
		<fmt:message key = "name" var = "name"/>
		<fmt:message key = "greeting" var = "msg"/>
		<h3> ${name } ${msg }</h3>
	</fmt:bundle>
</body>
</html>