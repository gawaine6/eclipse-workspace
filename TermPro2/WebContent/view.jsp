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
<title>상세보기</title>
</head>
<body>
	<%
		// 로그인을 하게 되면 세션유지
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String)session.getAttribute("userID");
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
	%>
	<nav class = "navbar navbar-expand-lg navbar-light bg-light">
		<a class = "navbar-brand" href = "main.jsp">JSP 게시판 웹 사이트</a>
		<a class = "navbar-brand text-secondary" href = "main.jsp">메뉴</a>
		<a class = "navbar-brand text-secondary, active" href = "bbs.jsp">게시판</a>
		<% 
			// 로그인이 되어있지 않다면 로그인, 회원가입 탭이 보이도록 하자
			if(userID == null) { 
		%>
		<div class = "dropdown">
			<button class = "btn btn-secondary dropdown-toggle" type = "button" id = "dropdownMenuButton" data-toggle = "dropdown" aria-haspopup = "true"
				aria-expanded = "false">접속하기</button>
			<div class = "dropdown-menu" aria-labelledby = "dropdownMenuButton">
				<a class = "dropdown-item" href = "login.jsp">로그인</a>
				<a class = "dropdown-item" href = "join.jsp">회원가입</a>
			</div>
		</div>
		<% 
			} else { // 회원가입이 되어있다면 회원관리탭이 나오고 로그아웃 할 수 있도록 하자, 로그아웃이 되면 메인페이지로 돌아간다
		%>
		<div class = "dropdown">
			<button class = "btn btn-secondary dropdown-toggle" type = "button" id = "dropdownMenuButton" data-toggle = "dropdown" aria-haspopup = "true"
				aria-expanded = "false">회원관리</button>
			<div class = "dropdown-menu" aria-labelledby = "dropdownMenuButton">
				<a class = "dropdown-item" href = "logoutProcess.jsp">로그아웃</a>
			</div>
		</div>
		<%
			}
		%>
	</nav>
	<div class = "container">
		<div class = "row">
				<table class = "table table-striped" style = "text-align : center; border : 1px solid #dddddd">
					<thead>
						<tr>
							<th colspan = "3" style = "background-color : #eeeeee;, text-align : center;">글보기</th>
						</tr>
					</thead>
					<tbody>
					<tr>
						<td style = "width : 20%;">글제목</td>
						<td colspan = "2"><%=bbs.getBbsTitle()%></td>
					</tr>
					<tr>
						<td>작성자</td>
						<td colspan = "2"><%=bbs.getUserID() %></td>
					</tr>
					<tr>
						<td>작성일</td>
						<td colspan = "2"><%=bbs.getBbsDate().substring(0, 11) %></td>
					</tr>
					<tr>
						<td>내용</td>
						<td colspan = "2" style = "min-height : 200px; text-align : left;"><%=bbs.getBbsContent()%></td>
					</tr>
					</tbody>
				</table>
					<!-- <input type = "submit" class = "btn btn-primary" value = "글쓰기"> -->
				<a href = "bbs.jsp" class = "btn btn-primary">목록</a>
				<%
					if(userID != null && userID.equals(bbs.getUserID())) {
				%>
						<a href = "update.jsp?bbsID=<%=bbsID %>" class = "btn btn-primary">수정</a>
						<a href = "deleteProcess.jsp?bbsID=<%=bbsID %>" class = "btn btn-primary">삭제</a>
				<%
					}
				%>
		</div>
	</div>
	<script src = "https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src = "js/bootstrap.js"></script>
</body>
</html>