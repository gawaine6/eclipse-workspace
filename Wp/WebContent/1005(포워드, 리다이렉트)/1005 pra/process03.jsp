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
		String name = request.getParameter("name");
	%>
	<p>
		Name Parameter = <%=name %> <br>
		Request Length = <%=request.getContentLength() %> <br>
		Request Method = <%=request.getMethod() %> <br>
		Request URI = <%=request.getRequestURI() %> <br>
		ServerName = <%=request.getServerName() %> <br>
		ServerPort = <%=request.getServerPort() %> <br>
	</p>
	<hr>
	<p>
		Client IP = <%=request.getRemoteAddr() %> <br>
		Request Content Encoding = <%=request.getCharacterEncoding() %> <br>
		Query String = <%=request.getQueryString() %> <br>
		Request Context Path = <%=request.getContextPath() %> <br>		
	</p>
</body>
</html>