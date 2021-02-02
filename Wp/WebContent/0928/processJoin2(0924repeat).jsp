<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% request.setCharacterEncoding("utf-8"); %>
	<jsp:useBean id = "member" class = "wp.Member" scope = "request" />
	<!-- Member member = new Member(); 이거랑 같은 소리  -->
	<jsp:setProperty name = "member" property = "*" /> <!-- member의 프로퍼티값 싹 다(*) -->
	<!-- jsp:setProperty name = "member" property = "phone" param = "phoneNum" -->
	<!-- 받는 파라미터의 이름이 다른 경우, FormTest(0924repeat)로 가서 보세오 -->
	<!-- property는 객체가 가지는 데이터라고 생각하면 된다
		 name에는 변수 이름을 넣어줘야된다
		 useBean 에서는 id로 쓰지만 setProperty 에서는 name으로 쓴다
		 property 에는 메소드가 와야된다
		 만약에 setName 메소드를 가져오고 싶으면 name 이라고 써주면 된다는 거지
		 여기서는 안에 꺼 전부 다 가져올거니까 *
		 값을 설정할 때 아무것도 안 쓰는 방법이 있고
		 끝에 value를 넣어주는 방법이 있고
		 따로 페이지를 하나 만들어서 입력값을 전달받아오는 방식이 있다
	-->
	<jsp:forward page = "dbinsert(0924repeat).jsp" />
</body>
</html>