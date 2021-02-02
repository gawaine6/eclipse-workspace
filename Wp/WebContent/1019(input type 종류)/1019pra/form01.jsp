<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action = "process01.jsp" name = "member" method = "post">
		<p>ID : <input type = "text" name = "id"><input type = "button" value = "중복검사"></p>
		<p>PASSWD : <input type = "text" name = "passwd"></p>
		<p>NAME : <input type = "text" name = "name"></p>
		<p>CONTACT : <input type = "text" maxLength = "4" size = "4" name = "phone1">
					 <input type = "text" maxLength = "4" size = "4" name = "phone2">
					 <input type = "text" maxLength = "4" size = "4" name = "phone3">
		</p>
		<p>SEX : <input type = "radio" name = "sex" value = "Male">Male
				 <input type = "radio" name = "sex" value = "Female">Female
		</p>
		<p>HOBBY : Reading <input type = "checkbox" name = "hobby">
				   Exercise <input type = "checkbox" name = "hobby">
				   Movie <input type = "checkbox" name = "hobby">
		<p><input type = "submit" value = "transmit">
		   <input type = "submit" value = "cancel">
		</p> 
	</form>
</body>
</html>