<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- EL(Expression Language) 를 알아봅시다 -->
<!-- ELIgnored는 기본적으로 false -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		out.println("<h2> Expression </h2>");
		String str = "what the hell";
	%>
	
	<%=
		"<h3> Expression </h3>"
	%>

	<%
		String name = request.getParameter("name");
		// 문자열만 받아오는가보다
		String age = request.getParameter("age");
	%>
	
	<%="이름 : " + name + "<br>"%>
	<%="나이 : " + age + "<br>"%>
	
	<h2>이름 : ${param.name}</h2> <!-- expression language 사용하는 방법 -->
	<h2>나이 : ${param.age}</h2>
	
	<!--
	아무것도 입력 안 받으면 둘 다 null이 뜬다 
	파라미터를 받아야하는데 주소창에 파일주소?name=홍길동&age=20 이라고 하면 name, age가 뜬다
	한글 안 뜨면 영어로 써봅시다
	한글이 안된다면 request.setCharacterEncoding("utf-8"); 를 해줍시다
	-->
</body>
</html>

