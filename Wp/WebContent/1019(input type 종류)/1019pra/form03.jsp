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
		<form action = "process04.jsp" name = "member" method = "post">
			<p>아이디 : <input type="text" name="id"> <input type="button" value="중복검사"></p>
			<p>비밀번호 : <input type="text" name="passwd"></p>
			<p>이름 : <input type="text" name="name"></p>
			<p>phone : 
				<select name = "phone1">
					<option value = "010">010</option>
					<option value = "011">011</option>
					<option value = "016">016</option>
					<option value = "017">017</option>
				</select> -
				<input type = "text" maxLength = "4" size = "4" name = "phone2"> -
				<input type = "text" maxLength = "4" size = "4" name = "phone3">
			</p>
			<p>sex : Male<input type = "radio" name = "sex" value = "Male">
					 Female<input type = "radio" name = "sex" value = "Female">
			</p>
			<p>hobby : Shopping<input type = "checkbox" name = "hobby1">
					   YouTube<input type = "checkbox" name = "hobby2">
					   Hunting<input type = "checkbox" name = "hobby3">
			</p>
			<p>hometown :
				<select name = "city" size = "3">
					<option value = "seoul">seoul</option>
					<option value = "gyunggi">gyunggi</option>
					<option value = "gangwon">gangwon</option>
				</select>
				detail
					<select name = "detail" size = "5">
					<optgroup label = "seoul">seoul
						<option value = "gangnam">gangnam</option>
						<option value = "gangnam1">gangnam1</option>
						<option value = "gangnam2">gangnam2</option>
					</optgroup>
					<optgroup label = "gyunggi">gyunggi
						<option value = "11">11</option>
						<option value = "22">22</option>
						<option value = "33">33</option>
					</optgroup>	
					</select>
			</p>
			<p> <textarea name = "comment" cols = "30" rows = "4" placeholder = "join comment"> </textarea> </p>
			<input type = "submit" value = "transmit">
			<input type = "submit" value = "cancel">
		</form>
</body>
</html>