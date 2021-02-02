<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="member" class = "wp.Member" scope = "request" />
	<%
	out.print("You Joined " + member.getId() + ", " + member.getName() + ", " + member.getPhone() + ", " + 
				member.getBirth() + ", " + member.getGender());
	%>
</body>
</html>