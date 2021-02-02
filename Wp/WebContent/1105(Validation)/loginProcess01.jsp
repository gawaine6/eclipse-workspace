<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validation</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String loginID = request.getParameter("loginID");
		// String loginPasswd = request.getParameter("loginPasswd");
		String name = request.getParameter("name");
	%>
	<p>ID : <%=loginID %></p>
	<p>PASSWD : ${param.loginPasswd }</p>
	<p>NAME : ${param.name }</p>
</body>
</html>