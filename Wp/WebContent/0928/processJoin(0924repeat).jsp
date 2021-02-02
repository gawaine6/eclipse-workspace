<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="wp.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	request.setCharacterEncoding("utf-8");
	// id, name, phone 파라미터를 받아온다 이마리야
	String id = request.getParameter("id");
	String name = request.getParameter("name");
	String phone = request.getParameter("phone");

	// 다른 객체를 만들어서 넘겨줘야 한다면
	Member member = new Member();
	// 근데 걍 객체 생성하면 빨간 줄 끄임
	// page import 해줘야합니두 위에 있습니둥
	// member.id = id;
	// member.name = name; 이렇게 하면 정보은닉에 의해서 안됩니두 그래서 우리가 만든게 set, get
	// member.setId(id); 이거 이렇게 하면 에러, Member에서 Int로 받거든, 근데 여기는 String이라서 에러
	member.setId(Integer.parseInt(id)); // Integer.parseInt() 를 써서 문자열을 int로 전환
	member.setName(name);
	member.setPhone(phone);
	
	request.setAttribute("member", member);
	// request.setAttribute("객체명", 객체);
	// member란 이름으로 request 객체 안에 member를 박을 수 있다
	// param으로 하면 객체 자체에 파라미터를 줄 수 없어서 이 방법을 쓴다
	%>
	
	<jsp:forward page = "dbinsert(0924repeat).jsp" />
</body>
</html>