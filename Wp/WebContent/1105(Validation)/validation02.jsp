<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Validation</title>
</head>
<body>
	<script type = "text/javascript">
		function checkLogin() {
			var form = document.loginForm;
			var idValue = form.loginID.value;
			var pwValue = form.loginPasswd.value;
			/* 
				ID 소문자인지 검사 : 아니면 재입력
				PW 숫자인지 검사 : 아니면 재입력
				이러면 모든 값을 다 확인해봐야 한다
			*/
			if(idValue == "") {
				alert("아이디써");
				return false;
			}
			for(i = 0; i < idValue.length; i++) {
				var ch = idValue.charAt(i);
				if(ch < 'a' || ch > 'z') {
					alert("ID는 소문자가 개눙");
					form.idValue.select();
					return false;
				}
			}
			if(isNaN(pwValue) == true) {
				alert("비번은 숫자만");
				form.pwValue.select();
				return false;
			}
		}
	</script>
	<form name = "loginForm" action = "loginProcess02.jsp">
		<p>ID : <input type = "text" name = "loginID"></p>
		<p>PASSWD : <input type = "password" name = "loginPasswd"></p>
		<p>NAME : <input type = "text" name = "name"></p>
		<p><input type = "submit" value = "login" onclick="return checkLogin()"></p>
	</form>
</body>
</html>