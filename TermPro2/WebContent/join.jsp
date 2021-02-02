<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name = "viewport" content = "width = device-width" , initial-scale = "1">
<link rel = "stylesheet" href = "css/bootstrap.min.css">
<title>회원가입</title>
</head>
<body>
	<nav class = "navbar navbar-expand-lg navbar-light bg-light">
		<a class = "navbar-brand" href = "main.jsp">JSP 게시판 웹 사이트</a>
		<a class = "navbar-brand text-secondary" href = "main.jsp">메뉴</a>
		<a class = "navbar-brand text-secondary" href = "bbs.jsp">게시판</a>
		<div class = "dropdown">
			<button class = "btn btn-secondary dropdown-toggle" type = "button" id = "dropdownMenuButton" data-toggle = "dropdown" aria-haspopup = "true"
				aria-expanded = "false">접속하기</button>
			<div class = "dropdown-menu" aria-labelledby = "dropdownMenuButton">
				<a class = "dropdown-item" href = "login.jsp">로그인</a>
				<a class = "dropdown-item" href = "join.jsp">회원가입</a>
			</div>
		</div>
	</nav>
	<div>
		<div class = "col-lg-4" style = "margin-left : 30%;"> <!-- 여기 중앙정렬 해야됨 -->
			<div class = "jumbotron" style = "padding-top: 20px;">
				<form method = "post" action = "joinProcess.jsp">
					<h3 style = "text-align: center;">회원가입</h3>
					<div class = "form-group">
						<input type = "text" class = "form-control" placeholder = "아이디" name = "userID" maxlength = "12">
					</div>
					<div class = "form-group">
						<input type = "password" class = "form-control" placeholder = "비밀번호" name = "userPassword" maxlength = "20">
					</div>
					<div class = "form-group">
						<input type = "text" class = "form-control" placeholder = "이름" name = "userName" maxlength = "12">
					</div>
					<div class = "form-group" style = "text-align : center;">
						<div>
							<label> <!-- 기본적으로 선택이 되도록 하는거 -->
								<input type = "radio" name = "userGender" value = "M" checked>남자
							</label>
							<label> <!-- 기본적으로 선택이 되도록 하는거 -->
								<input type = "radio" name = "userGender" value = "F">여자
							</label>
						</div>
					</div>
					<div class = "form-group">
						<input type = "email" class = "form-control" placeholder = "이메일" name = "userEmail" maxlength = "12">
					</div>
					<input type = "submit" class = "btn btn-primary form-control" value = "회원가입">
				</form>
			</div>
		</div>
	</div>
	<script src = "https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src = "js/bootstrap.js"></script>
</body>
</html>