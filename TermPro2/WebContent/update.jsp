<%@ page language = "java" contentType = "text/html; charset = UTF-8"
	pageEncoding = "UTF-8"%>
<%@ page import = "term.BbsDAO" %>
<%@ page import = "term.Bbs" %>
<%@ page import = "java.io.PrintWriter" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8">
<!-- 반응형 웹으로 작동하도록 합니다 -->
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title>글 수정</title>
</head>
<body>
	<%
		// 로그인을 하게 되면 세션유지
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String)session.getAttribute("userID");
		}
		if(userID == null) {
			PrintWriter script = response.getWriter();
			script.println("<script>");
			script.println("alert('You sholud login')");
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
		}
	%>
	<nav class = "navbar navbar-expand-lg navbar-light bg-light">
		<a class = "navbar-brand" href = "main.jsp">JSP 게시판 웹 사이트</a>
		<a class = "navbar-brand text-secondary" href = "main.jsp">메뉴</a>
		<a class = "navbar-brand text-secondary, active" href = "bbs.jsp">게시판</a>
	</nav>
	<div class = "container">
		<div style = "width : 90%;">
			<form method = "post" action = "updateProcess.jsp?bbsID=<%=bbsID%>">
				<table class = "table table-striped" style = "text-align : center; border : 1px solid #dddddd">
					<thead>
						<tr>
							<th style = "background-color : #eeeeee;, text-align : center;">글 수정</th>
						</tr>
					</thead>
					<tbody>
					<tr>
						<td><input type = "text" class = "form-control" placeholder = "글제목" name = "bbsTitle" maxlength = "50" value = "<%=bbs.getBbsTitle() %>"></td>
					</tr>
					<tr>
						<td><textarea class = "form-control" placeholder = "글내용" name = "bbsContent" style = "widght : 800px; height : 500px;"><%=bbs.getBbsContent() %></textarea></td>
					</tr>
					</tbody>
				</table>
				<input type = "submit" class = "btn btn-primary" value = "글 수정">
			</form>
		</div>
	</div>
	<script src = "https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src = "js/bootstrap.js"></script>
</body>
</html>