<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Validation</title>
</head>
<body>
	<script type = "text/javascript">
		function checkForm() {
			// 실행되면 내부적으로 자바스크립트 객체로 바꿔서 인식하게 된다
			{
/* 				// 내가 쓴 ID가 보이게 해보자
				alert(document.loginForm.loginID.value);
				alert(document.loginForm.loginPasswd.value); */
				len = document.loginForm.name.length;
				var firstChar = document.loginForm.name.value.substring(0, 1);
				if(document.loginForm.loginID.value == "") {
					alert("shit");
					document.loginForm.loginID.select();
					return false;
				} else if(document.loginForm.loginPasswd.value == "") {
					alert("fuck");
					document.loginForm.loginPasswd.select();
					return false;
				} else if(len < 6 || len > 12) { // name의 길이가 6보다 작거나 12보다 클 경우
					alert("again");
					document.loginForm.name.select();
					return false;
				} else if(isNaN(firstChar) == false) { // Not a Number 숫자가 아니다, 저거는 숫자가 아닌게 아니다, 즉 숫자다
					alert("NAME firstChar must be a String");
					document.loginForm.name.select();
					return false;
				}
				
				return true;
			}
		}
	</script>
	<form name = "loginForm" action = "loginProcess01.jsp">
		<p>ID : <input type = "text" name = "loginID"></p>
		<p>PASSWD : <input type = "password" name = "loginPasswd"></p>
		<p>NAME : <input type = "text" name = "name"></p>
		<p><input type = "submit" value = "transmit" onclick="return checkForm()"></p>
	</form>
</body>
</html>