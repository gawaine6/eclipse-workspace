<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*"%>
<%@ page import = "java.net.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>This file is TestParam.jsp</h3>
	<p>utils.jsp file</p>
	<%@ include file = "utils.jsp" %>
	<p>Included4Param.jsp file</p>
	<%= "name parameter : " + request.getParameter("name") %> <br>
	<%
		request.setAttribute("age" , "15");
	%>
	<jsp:include page = "Included4Param.jsp">
		<jsp:param name = "dateStr" value = "<%=new Date() %>" />
		<jsp:param name = "title" value = '<%= URLEncoder.encode("아저씨", "utf-8") %>' />
	</jsp:include>
</body>
</html>