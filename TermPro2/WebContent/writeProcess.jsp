<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "term.BbsDAO" %>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id = "bbs" class = "term.Bbs" scope = "page" />
	<jsp:setProperty property="bbsTitle" name="bbs"/>
	<jsp:setProperty property="bbsContent" name="bbs"/>
	
	<%
		// 세션 관리 부분
		String userID = null;
		if(session.getAttribute("userID") != null) {
			userID = (String)session.getAttribute("userID");
		}
		// 로그인되어 있으면 메인 페이지로 돌아가도록
		if(userID == null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('You should Login')");
			script.println("location.href = 'login.jsp'"); // 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		} else {
			if(bbs.getBbsTitle() == null || bbs.getBbsContent() == null) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('Fill the all column')");
				script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
				script.println("</script>");
			} else {	
			BbsDAO bbsDAO = new BbsDAO();
			int result = bbsDAO.write(bbs.getBbsTitle(), userID, bbs.getBbsContent());
			if(result == -1) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('Write Fail')");
				script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
				script.println("</script>");
			} else {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("location.href = 'bbs.jsp'");
				script.println("</script>");
				}
			} 
		} 
	%>
</body>
</html>