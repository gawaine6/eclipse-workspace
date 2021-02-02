<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "term.BbsDAO" %>
<%@ page import = "term.Bbs" %>
<%@ page import = "java.io.PrintWriter" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setCharacterEncoding("utf-8"); %>

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
		} 
		int bbsID = 0;
		if(request.getParameter("bbsID") != null) {
			bbsID = Integer.parseInt(request.getParameter("bbsID"));
		}
		if (bbsID == 0) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('No content')");
			script.println("location.href = 'bbs.jsp'"); // 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		}
		Bbs bbs = new BbsDAO().getBbs(bbsID);
		if(!userID.equals(bbs.getUserID())) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('Permission denied')");
			script.println("location.href = 'bbs.jsp'"); // 로그인 페이지로 돌려보내는 거
			script.println("</script>");
		} else {
			if(request.getParameter("bbsTitle") == null || request.getParameter("bbsContent") == null || 
					request.getParameter("bbsTitle").equals("") || request.getParameter("bbsContent").equals("")) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('Fill the all column')");
				script.println("history.back()"); // 이전페이지로 돌아가는 메소드, 여기서는 다시 로그인 페이지로 돌려보내는 거
				script.println("</script>");
			} else {	
			BbsDAO bbsDAO = new BbsDAO();
			int result = bbsDAO.update(bbsID, request.getParameter("bbsTitle"), request.getParameter("bbsContent"));
			if(result == -1) {
				PrintWriter script = response.getWriter();
				script.println("<script>");
				script.println("alert('Update Fail')");
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