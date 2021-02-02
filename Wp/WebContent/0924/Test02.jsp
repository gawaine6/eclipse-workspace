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
	<%
		request.setCharacterEncoding("utf-8");
	%>
	<jsp:useBean id = "mb" class = "wp.Member" />
	<jsp:setProperty property="id" name="mb" param = "id"/>
	<jsp:setProperty property="name" name="mb" param = "name"/>
	<jsp:setProperty property = "*" name = "mb" /> 
	<!-- 전부 다 받아오고 싶으면 위에 두줄 아래 다 지우고 이거 한줄 쓰면 됨 
		근데 이건 넘어온 프로퍼티와 파라미터의 이름이 똑같다는 가정 하에 이게 된다 같으면 param 까지 생략해도 됨
	-->
	<%= mb %>
	
	<%
		/*
		request.setCharacterEncoding("utf-8");
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		
		Member member = new Member();
		member.setName(name);
		int ivalue = Integer.parseInt(id);
		member.setId(ivalue);
		out.println(member);
		*/
	%>
</body>
</html>