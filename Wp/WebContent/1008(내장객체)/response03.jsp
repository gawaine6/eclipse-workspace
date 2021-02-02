<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>This page refresh every 5s</h3>
	<%
		response.setIntHeader("Refresh", 5);
	%>
	<h4>Server Time : <%= new Date() %></h4>
</body>
</html>