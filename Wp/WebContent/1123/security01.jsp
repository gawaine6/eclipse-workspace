<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Auth Complete</h4>
	<%
		if(request.isUserInRole("manager")) {
			out.println("<h3>어 왔니</h3>");
		}
	%>
</body>
</html>