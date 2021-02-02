<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.Enumeration" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Enumeration<String> hnames = request.getHeaderNames();
		while(hnames.hasMoreElements()) // hnames 에 원소가 저장되어 있으면 
		{
			String headerName = hnames.nextElement(); // hnames는 다음 값으로 가서 headerName에 저장
			String headerValue = request.getHeader(headerName); // 저장된 headerName을 headerValue에 저장
			out.println(headerName + " : " + headerValue + "<br>");
		}
	%>
</body>
</html>