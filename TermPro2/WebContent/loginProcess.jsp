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
	<%request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id = "user" class = "term.User" scope = "page" />
	<jsp:setProperty property="userID" name="user"/>
	<jsp:setProperty property="userPassword" name="user"/>
	
	<%
		// 세션 관리 부분
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String)session.getAttribute("userID");
		}
		// 로그인되어 있으면 메인 페이지로 돌아가도록
		if(userID != null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('Already Login')");
			script.println("location.href = 'main.jsp'"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		}
		UserDAO userDAO = new UserDAO();
		int result = userDAO.login(user.getUserID(), user.getUserPassword());
		if(result == 1) {
			session.setAttribute("userID", user.getUserID());
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("location.href = 'main.jsp'");
			script.println("</script>");
		} else if(result == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('Password wrong')");
			script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		} else if(result == -1) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('Not Found ID')");
			script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		} else if(result == -2) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('Database Error')");
			script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		} 
	%>
</body>
</html>