<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id = "member" class = "wp.Member" scope = "request" />
	<!-- id : 내가 접근할 객체이름, class : 객체가 있는 위치(패키지포함) -->
	<jsp:setProperty name="member" property = "*"/>
	<!-- name : 내가 가져올 객체이름, property : 객체에 포함된 파라미터?? -->
	<jsp:forward page="dbinsert(pra).jsp" />
	<!-- 이 페이지에서 받은 값을 넘겨줄 페이지 -->
</body>
</html>