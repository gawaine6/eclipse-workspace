<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<script type = "text/javascript">
		function checkForm() {
			var regExp = /^[a-z|A-Z|가-힣]/; // 따옴표로 묶지마라, /로 시작한다, /패턴/옵션 순서로 온다
			// 패턴을 따르는지 검사를 해보자
			
 			var value = document.form.title.value; // 먼저 값 가져오고
			
			if(regExp.test(value) == false) {
				alert("Title can't start with number");
 				return false;
			} else {
 				alert("Matched");		
			} 
 			return true;
		}
	</script>
	<form name = "form">
		<p>Title : <input type = "text" name = "title"></p>
		<input type = "submit" value = "Transmit" onclick = "return checkForm()">
	</form>
</body>
</html>