<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Locale" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Localization (L10n)</title>
</head>
<body>
	<%
		Locale locale = request.getLocale();
		String displayLanguage = locale.getDisplayLanguage();
		String lang = locale.getLanguage();
		
		String displayCountry = locale.getDisplayCountry();
		String country = locale.getCountry();
	%>
	
	Locale lang : <%=displayLanguage %>
	Locale lang code : <%=lang %>
	Locale Country : <%=displayCountry %>
	Locale Coutry code : <%=country %>
</body>
</html>