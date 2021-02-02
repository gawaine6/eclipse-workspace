<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import = "java.util.*" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메인 화면</title>

</head>
<body>
<!--
<nav class = "navbar navbar-expand-lg navbar-dark bg-dark">
	<div class = "container">
		<div class = "navbar-header">
			<a class = "navbar-brand" href = "Welcome.jsp">Home</a>
		</div>
	</div>
</nav>
이 내용이 menu.jsp에 들어가있다
-->
	<%@ include file = "menu.jsp" %> <!-- jsp의 모듈화랑 똑같은 개념 -->
	<div class = "jumbotron jumbotron-fluid">
		<div class = "container">
			<h1 class = "display-3"><%=greeting %></h1>
		</div>
	</div>
	
	<div class = "container-fluid">
		<div class = "text-center">
			<h3> <%=tagLine %></h3>
			<%
				Calendar cal = Calendar.getInstance();
			
				int hour = cal.get(Calendar.HOUR_OF_DAY);
				int minute = cal.get(Calendar.MINUTE);
				int second = cal.get(Calendar.SECOND);
				
				out.println("Access Time : " + hour + ":" + minute + ":" + second);
			%>
			<p><a href = "products.jsp" class = "btn btn-secondary">상품 목록 &raquo;</a></p>
			<p><a href = "addProduct.jsp" class = "btn btn-secondary">상품 추가 &raquo;</a></p>
		</div>
	<%!
		String greeting = "Welcome to Web Shopping Mall";
		String tagLine = "Welcome to Web Market";
	%>
	</div>
	<hr>
	<%@ include file = "footer.jsp" %>
	</body>
</html>