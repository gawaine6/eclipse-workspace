<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Page Count is : 
	<!--  스크립 틀릿 -->
	<%
		out.print(increaseNgetCount());
	%>
	
	<%! 
	int count = 0;
	
	public int increaseNgetCount() {
		return ++count;
	}
	%>
</body>
</html>