<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id = "person" class = "wp.Person" scope = "request"/>
	<h4> Id : <%=person.getId()%> </h4>
	<h4> Name : <%=person.getName() %></h4>
	<%
		person.setId(1901135);
		person.setName("abcd");
	%>
	<p>jsp include</p>
	<jsp:include page = "Test02.jsp" />
</body>
</html>