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
	<%=request.getLocale() %>
	<fmt:setLocale value = "<%=request.getLocale() %>" />
	<fmt:setBundle var = "message" basename = "resourceBundle.message" />
	
	<fmt:message key = "name" bundle = "${message }" var = "name"/>
	<fmt:message key = "greeting" bundle = "${message }" var = "msg"/>
	<h3>${name } ${msg }</h3>
	
</body>
</html>