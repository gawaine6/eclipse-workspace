<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "process02.jsp" method = "post"> <!-- 서버에 request 하면 process02.jsp 파일의 결과를 불러오도록 한다 -->
		Name : <input type = "text" name = "id">  <!-- 아이디 값은 id -->
		Password : <input type = "text" name = "password"> <!-- 아이디 값은 password -->
		<input type = "submit" value = "transmit">
	</form>
</body>
</html>