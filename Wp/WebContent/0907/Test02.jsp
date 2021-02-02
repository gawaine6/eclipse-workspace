<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%! // 선언문
		int count = 0;	
	%>
	
	Page Count is :
	<% // 스크립틀릿
		out.println(++count);
	%>
</body>
</html>