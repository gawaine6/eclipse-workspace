<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!-- 스클립틀릿 태그를 사용해서 1부터 10까지 짝수만 출력하기 -->
<%
	for(int i = 1; i <= 10; i++) {
		if(i % 2 == 0)
			out.println(i + "<br>");
	}
%>

현재시간 : 
<%= new java.util.Date() %>
</body>
</html>