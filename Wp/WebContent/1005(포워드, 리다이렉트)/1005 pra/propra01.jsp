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
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int result1 = Integer.parseInt(num1) + Integer.parseInt(num2);
		request.setAttribute("result1", result1);
		
		int result2 = Integer.parseInt(num1) - Integer.parseInt(num2);
		request.setAttribute("result2", result2);
		
		int result3 = Integer.parseInt(num1) / Integer.parseInt(num2);
		request.setAttribute("result3", result3);
		
		int result4 = Integer.parseInt(num1) * Integer.parseInt(num2);
		request.setAttribute("result4", result4);
	%>

	<jsp:forward page = "propra01-1.jsp" />
</body>
</html>