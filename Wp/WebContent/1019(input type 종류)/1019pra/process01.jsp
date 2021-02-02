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
		request.setCharacterEncoding("utf-8");
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String passwd = request.getParameter("passwd");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String sex = request.getParameter("sex");
		String hobby = request.getParameter("hobby");
	%>
	
	<p>ID : <%=id %></p>
	<p>Name : <%=name %></p>
	<p>passwd : <%=passwd %></p>
	<p>phone : <%=phone1 %> - <%=phone2 %> - <%=phone3 %></p>
	<p>sex : <%=sex %></p>
	<p>hobby : <%=hobby %></p>
</body>
</html>