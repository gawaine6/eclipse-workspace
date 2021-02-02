<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Implicit Objects(내장 객체)</title>
</head>
<body>
	<%
		Enumeration<String> hnames = request.getHeaderNames();
		// 원소가 저장되어 있으면 원소를 가리키는 커서가 있다고 가정했을 때 hasMoreElements를 만날 때 마다 커서가 하나씩 내려간다
		// 원소가 있으면 true, 없으면 false
		while (hnames.hasMoreElements()) {
			String headerName = hnames.nextElement();
			String headerValue = request.getHeader(headerName);
			out.println(headerName + " : " + headerValue + "<br>");
		}
	%>
</body>
</html>