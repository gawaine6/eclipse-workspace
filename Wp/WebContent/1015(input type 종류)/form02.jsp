<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Join</h3>
	<form action = "#" name = "member" method = "post">
		<p>아이디 : <input type="text" name="id"> <input type="button" value="중복검사"></p>
		<p>비밀번호 : <input type="text" name="passwd"></p>
		<p>이름 : <input type="text" name="name"></p>
		<p>연락처 : 
			<select name = "phone1">
				<option value = "010">010</option>
				<option value = "011">011</option>
				<option value = "016">016</option>
				<option value = "017">017</option>
			</select>-
			<input type="text" maxlength = "4" size = "4" name = "phone2"> -
			<input type="text" maxlength = "4" size = "4" name="phone3">
		</p>
		<p>성별 : 남<input type="radio" name="sex" value="Male" checked>
				 여<input type="radio" name="sex" value="FeMale">
		</p>
		<p>취미 : 쇼핑<input type="checkbox" name="hobby1" checked>
				 유튜브<input type="checkbox" name="hobby2">
				 모기사냥<input type="checkbox" name="hobby3">
		</p>
		<p> <textarea name = "comment" cols = "30" rows = "3" placeholder = "가입인사 입력"> </textarea></p>
		<p>
			<input type = "submit" value = "transmit" />
			<input type = "submit" value = "cancel" />
		</p>
	</form>
</body>
</html>