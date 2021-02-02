<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<!-- 정규표현식을 이용해봅시다 -->
<body>
	 <script type = "text/javascript">
		function checkForm() {
			var regExp = /Java/i; // 따옴표로 묶지마라, /로 시작한다, /패턴/옵션 순서로 온다
			// 패턴을 따르는지 검사를 해보자
			
 			var value = document.form.title.value; // 먼저 값 가져오고
			/*
 			var result = regExp.exec(value); // value가 regExp의 조건을 만족하냐
			if(result != null)
				alert(result);
			else 
				alert("Not matched");
			*/
			if(regExp.test(value) == true) 
				// 정규표현식을 만족하면 true 아니면 false 반환
				alert("Matched");
			else 
				alert("Not Matched");
		}
	</script>
	<form name = "form">
		<p>Title : <input type = "text" name = "title"></p>
		<input type = "submit" value = "Transmit" onclick = "return checkForm()">
	</form>
</body>
</html>