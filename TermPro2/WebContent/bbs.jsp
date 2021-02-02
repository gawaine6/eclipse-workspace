<%@ page language = "java" contentType = "text/html; charset = UTF-8"
	pageEncoding = "UTF-8"%>
<%@ page import = "java.io.PrintWriter" %>
<%@ page import = "term.BbsDAO" %>
<%@ page import = "term.Bbs" %>
<%@ page import = "java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset = "UTF-8">
<meta name = "viewport" content = "width = device-width" , initial-scale = "1">
<!-- 반응형 웹으로 작동하도록 합니다 -->
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title>게시판</title>
</head>
<body>
	<%
		// 로그인을 하게 되면 세션유지
		String userID = null;
		if (session.getAttribute("userID") != null) {
			userID = (String)session.getAttribute("userID");
		}
		int pageNumber = 1; // 기본 페이지
		if(request.getParameter("pageNumber") != null) {
			pageNumber = Integer.parseInt(request.getParameter("pageNumber"));
		}
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
						<th style = "background-color : #eeeeee;, text-align : center;">게시물 번호</th>
						<th style = "background-color : #eeeeee;, text-align : center;">게시물 제목</th>
						<th style = "background-color : #eeeeee;, text-align : center;">작성자</th>
						<th style = "background-color : #eeeeee;, text-align : center;">작성일</th>
					</tr>
				</thead>
				<tbody>
				<%
					BbsDAO bbsDAO = new BbsDAO();
					ArrayList<Bbs> list = bbsDAO.getList(pageNumber);
					for(int i = 0; i < list.size(); i++) {
				%>
				<tr>
					<td><%= list.get(i).getBbsID() %></td>
					<td><a href = "view.jsp?bbsID=<%= list.get(i).getBbsID() %>"><%= list.get(i).getBbsTitle() %></a></td>
					<td><%= list.get(i).getUserID() %></td>
					<td><%= list.get(i).getBbsDate().substring(0, 11) %></td>
				</tr>
				<%
					}				
				%>						
				</tbody>
			</table>
			<a href = "write.jsp" class = "btn btn-primary">글쓰기</a>
		</div>
	</div>
	<script src = "https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src = "js/bootstrap.js"></script>
</body>
</html>