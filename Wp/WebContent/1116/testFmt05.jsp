<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Locale" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Locale locale = request.getLocale();
		if(locale.getLanguage().equals("ko")) {
			locale = Locale.KOREA;
		} else if(locale.getLanguage().equals("de")) {
			locale = Locale.GERMANY;
		}
	%>
	<fmt:setLocale value = "<%=locale %>"/>
	<p>Number : <fmt:formatNumber value = "12345.678" type = "number" /></p>
	<p>Currency : <fmt:formatNumber value = "12345.678" type = "currency" minFractionDigits = "3"/></p>
	<p>Percentage : <fmt:formatNumber value = "12345.678" type = "percent" minFractionDigits = "2"/></p>
	<p>Pattern(.000) : <fmt:formatNumber value = "12345.678" type = "number" minFractionDigits = "4"/></p>
</body>
</html>