<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "term.UserDAO" %>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id = "user" class = "term.User" scope = "page" />
	<jsp:setProperty property="userID" name="user"/>
	<jsp:setProperty property="userPassword" name="user"/>
	<jsp:setProperty property="userName" name="user"/>
	<jsp:setProperty property="userGender" name="user"/>
	<jsp:setProperty property="userEmail" name="user"/>
	
	<%
		if(user.getUserID() == null || user.getUserPassword() == null || user.getUserEmail() == null || user.getUserName() == null || user.getUserGender() == null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('Fill the all column')");
			script.println("</script>");
		} else {	
		UserDAO userDAO = new UserDAO();
		int result = userDAO.join(user);
		if(result == -1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('ID already exist')");
			script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		} else {
			session.setAttribute("userID", user.getUserID());
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = 'main.jsp'");
			script.println("</script>");
			}
		} 
	%>
</body>
</html>