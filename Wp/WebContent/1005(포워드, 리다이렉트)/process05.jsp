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
		String name = request.getParameter("name");
		// name을 DB에 넣는다. 치고!!
		System.out.println("name : " + name);
		response.sendRedirect("process05-1.jsp");
		// 결과는 process05-1.jsp
	%>
</body>
</html>