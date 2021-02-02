<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>name : <%=request.getRemoteUser() %></p>
	<p>type : <%=request.getAuthType() %></p>
	<p> user's role name is manager? :
		<%=request.isUserInRole("manager") %> </p>
	<p>user's role name is in role1? : 
		<%=request.isUserInRole("role1") %> </p>
</body>
</html>