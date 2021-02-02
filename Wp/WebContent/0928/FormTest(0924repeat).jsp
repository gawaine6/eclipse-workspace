<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "processJoin2(0924repeat).jsp" method = "post">
	<!-- 다른 쪽에 넘겨줄때는 form action = "" 해서 안에 넘겨줄 페이지 써주면 된다 method는 get or post -->
		ID : <input type = "text" name = "id"> <br>
		Name : <input type = "text" name = "name"> <br>
		Phone : <input type = "text" name = "phone"> <br>
		<input type = "submit" value = "Join">
	</form>
</body>
</html>
		<!-- Phone : <input type = "text" name = "phoneNum"> <br>
		만약에 받아오는 파라미터의 이름이 다르다면 어떻게 할까
		그냥 Member.java에서 phone을 phoneNum으로 바꿔줘도 되고
		이 파라미터를 받아오는 페이지(processJoin2(0924repeat).jsp)로 가서
		해당 다른 파라미터 이름으로 하나 새로 설정해주면 된다
		jsp:setProperty name = "member" property = "phone" param = "phoneNum"
		-->