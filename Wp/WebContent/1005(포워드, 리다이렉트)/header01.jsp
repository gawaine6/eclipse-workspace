<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String hostValue = request.getHeader("host"); // 요청했을 때 header에서 host라는 값 좀 가져와줄래
		String acceptLang = request.getHeader("accept-language"); // 얘는...뭐지..? 뭐 크게 중요한건 아니래,, 설정된 언어 뭐라는데
				
		out.print("호스트 명 : " + hostValue + "<br>");
		out.print("설정된 언어 : " + acceptLang + "<br>");
	%>
</body>
</html>