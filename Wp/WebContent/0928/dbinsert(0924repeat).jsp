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
	<jsp:useBean id = "member" class = "wp.Member" scope = "request" />
	<%
	/*
	System.out.println(request.getParameter("id"));
	System.out.println(request.getParameter("name"));
	System.out.println(request.getParameter("phone"));
	*/

	// Member member = (Member)request.getAttribute("member");
	// jsp:useBean을 써서 member 객체에 request를 넣어주면 새로운 멤버를 선언할 필요가 없다
	// 왜냐면 useBean이 새로운 객체 생성이랑 똑같은 개념이기 때문에 주석 풀어버리면 중복된 변수라고 뜬다
	// https://sun-p.tistory.com/20 형변환에 대한 설명

	out.print("You Joined " + member.getId() + ", " + member.getName() + ", " + member.getPhone());
	%>
	<h4>Id : <jsp:getProperty property = "id" name = "member" /></h4>
	<h4>Name : <jsp:getProperty property = "name" name = "member" /></h4>
	<h4>Phone : <jsp:getProperty property = "phone" name = "member" /></h4>
</body>
</html>