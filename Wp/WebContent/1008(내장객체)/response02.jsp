<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Cache-control : <%= response.getHeader("Cache-control") %> <br>
	Content-Type : <%= response.getHeader("Content-Type") %> <br>
	date : <%= response.getHeader("date") %> <br>
	
	<%
		response.setHeader("Cache-control", "no-cache");
		response.setDateHeader("date", 1L);
	%>
	
	<h4>After setting response Header</h4>
	Cache-control : <%= response.getHeader("Cache-control") %> <br>
	Content-Type : <%= response.getContentType() %> <br>
	date : <%= response.getHeader("date") %> <br>
</body>
</html>