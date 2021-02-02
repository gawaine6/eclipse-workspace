<!-- 자바 빈즈에 대해 알아봅시다 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id = "member" class = "wp.Member" />
	<%= member.getName() %>
</body>
</html>