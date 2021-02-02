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
		String passwd = request.getParameter("passwd");
		String name = request.getParameter("name");
		String phone1 = request.getParameter("phone1");
		String phone2 = request.getParameter("phone2");
		String phone3 = request.getParameter("phone3");
		String sex = request.getParameter("sex");
	%>
	
	<p>ID : <%=id %></p>
	<p>Password : <%=passwd %></p>
	<p>Name : <%=name %></p>
	<p>Contact : <%=phone1 %> - <%=phone2 %> - <%=phone3 %></p>
	<p>Sex : <%=sex %></p>
	<p>Hobby : Shpping[${param.hobby1}] YouTube[${param.hobby2}] Hunting[${param.hobby3}]</p>
	<p>City : Home[${param.city}] Detail[${param.detail}]</p>
	<p>Comment : [${param.comment}]</p>
</body>
</html>