<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*" %>
<%@ page import = "java.text.DateFormat, java.text.NumberFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Internationalization</title>
</head>
<body>
	<%
		Locale locale = request.getLocale();
		if(locale.getCountry().equals("")) {
			locale = Locale.KOREA;
		}
		String strDate = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.SHORT, locale).format(new Date());
		
		NumberFormat currency = NumberFormat.getCurrencyInstance(locale); // request 객체로 얻은 locale(지역정보)에 맞게 해당 지역의 통화단위를 가져온다
		NumberFormat percentage = NumberFormat.getPercentInstance(locale);
		
		String strCurrency = currency.format(1234567);
		String strPercentage = percentage.format(0.25);
	%>
	<p>Today is <%=strDate %></p>
	<p>Currency is <%=strCurrency %></p>
	<p>Percentage is <%=strPercentage %></p>
</body>
</html>