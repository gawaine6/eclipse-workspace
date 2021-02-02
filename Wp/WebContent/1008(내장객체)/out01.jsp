<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% 
		int a, b;
		a = 3;
		b = 5;
		out.println("out 내장객체 : " + (a + b) + "<br>");
		
		out.println("오늘 날짜랑 시간");
		out.println(Calendar.getInstance().getTime());
	%>
	
	<h4> 시간 : <%=new Date() %> </h4>
	
</body>
</html>