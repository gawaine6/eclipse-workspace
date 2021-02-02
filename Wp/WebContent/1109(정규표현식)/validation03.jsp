<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>Member Join</h3>
		<script type="text/javascript">
			function checkMember() {
				// id는 영어대소문자 또는 한글로 시작
				var regExpId = /^[a-z|A-Z|가-힣]/;
				// name은 한글로 시작해서 여러개 올 수 있고(*) 한글로 끝난다($)
				var regExpName = /^[가-힣]*$/;
				// passwd는 숫자로만 구성된다
				var regExpPasswd = /^[0-9]+$/;
				// Phone는 숫자 3자리 - 숫자 3or4자리 - 숫자 4자리
				var regExpPhone = /^\d{3}-\d{3,4}-\d{4}$/;
				// Email은 숫자 또는 영문자로 시작하고 -,_가 올 수 있고 다음 숫자나 영문자가 반복해서 올 수 있고
				// 다음에 @ 오고 다음에 숫자 또는 영문자가 오고 다음에 -,_가 올 수 있고 다음 숫자나 영문자가 반복해서 올 수 있고
				// 다음에 .이 오고 영문자가 2~3개로 끝난다 ex)gawaine6@gmail.com
				var regExpEmail = /^[0-9a-zA-Z]([\-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([\-_\.\]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;

				var form = document.member;

				var id = form.userID.value;
				var name = form.userName.value;
				var passwd = form.userPW.value;
				var phone = form.phone1.value + "-" + form.phone2.value + "-"
						+ form.phone3.value;
				var email = form.userEmail.value;

				if (!regExpId.test(id)) {
					alert("ID should start with String");
					form.id.select();
					return;
				}
				if (!regExpPasswd.test(passwd)) {
					alert("PW should start with Number");
					form.id.select();
					return;
				}
				if (!regExpName.test(name)) {
					alert("Name should start with Korean");
					form.id.select();
					return;
				}
				if (!regExpPhone.test(phone)) {
					alert("Check your Phone");
					form.id.select();
					return;
				}
				if (!regExpEmail.test(email)) {
					alert("Check your Email");
					form.id.select();
					return;
				}
				form.submit();
			}
		</script>
	<form action="process03.jsp" name="member" method="post">
		<p>ID : <input type="text" name="userID"></p>
		<p>PW : <input type="password" name="userPW"></p>
		<p>Name : <input type="text" name="userName"></p>
		<p>
			Contact : 
			<select name="phone1">
				<option value="010">010</option>
				<!-- 넘어가는 값(value)랑 보이는 값(display)이 같으면 굳이 value 안 써도 됨미다 아래에서부턴 지울게요-->
				<option>011</option>
				<option>016</option>
				<option>017</option>
			</select> - <input type="text" maxlength="4" size="4" name="phone2"> -
			<input type="text" maxlength="4" size="4" name="phone3"></p>
		<p>E-mail <input type="email" name="userEmail"></p>
		<p><input type="submit" value="Join" onclick="return checkMember()"></p>
	</form>
</body>
</html>