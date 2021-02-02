<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Object(내장 객체)</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String name = request.getParameter("name"); // name 파라미터 값을 전달
	%>
	<h4>Name : <%=name %></h4>
</body>
</html>

<!--  
request01.jsp를 요청
그 요청에 맞는 페이지를 보내줌
여기서는 process01.jsp를 실행해서 보내준다
-->
