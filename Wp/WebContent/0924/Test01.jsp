<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import = "wp.*" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id = "member" class = "wp.Member" />
	<jsp:setProperty name = "member" property = "gender" value = "nuclear" />
	GENDER : <jsp:getProperty property="gender" name="member"/>
	<!-- property는 객체가 가지는 데이터라고 생각하면 된다
		 name에는 변수 이름을 넣어줘야된다
		 useBean 에서는 id로 쓰지만 setProperty 에서는 name으로 쓴다
		 property 에는 메소드가 와야된다 member 에서는 id를 설정하는 메소드가 setId 니까
		 set을 빼고 Id를 소문자로 써준다
		 만약에 setName 메소드를 가져오고 싶으면 name 이라고 써주면 된다는 거지
		 값을 설정할 때 아무것도 안 쓰는 방법이 있고
		 끝에 value를 넣어주는 방법이 있고
		 따로 페이지를 하나 만들어서 입력값을 전달받아오는 방식이 있다(FormTest.jsp)
	-->

</body>
</html>

<!-- 
근데 굳이 이렇게 안 쓰고 page import - "wp.*" 써서 member 새 객체 만들면 되는거 아닌감
왜 굳이 이렇게 쓰는거지

-->