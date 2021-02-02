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
		String hostValue = request.getHeader("host");
		String acceptLang = request.getHeader("accept-language");
		
		out.print("hostName : " + hostValue + "<br>");
		out.print("acceptLang : " + acceptLang + "<br>");
	%>
</body>
</html>