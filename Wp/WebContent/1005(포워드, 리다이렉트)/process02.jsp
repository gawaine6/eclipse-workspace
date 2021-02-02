<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8"); // request 객체의 캐릭터를 utf-8로 인코딩
		String userid = request.getParameter("id"); // 파라미터로 id 값을 받아온다
		String password = request.getParameter("password"); // 파라미터로 password 값을 받아온다
	%>
	<h4>Name : <%= userid %></h4>
	<h4>Password : <%= password %></h4>
</body>
</html>