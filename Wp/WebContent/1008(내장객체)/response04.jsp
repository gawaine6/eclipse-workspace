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
		//response.setCharacterEncoding("euc-kr");
		response.setContentType("text/plain; charset = utf-8");
	%>
	<h4>Character Encoding : <%= response.getCharacterEncoding() %></h4>
	<h4>Content Type : <%= response.getContentType() %></h4>
</body>
</html>