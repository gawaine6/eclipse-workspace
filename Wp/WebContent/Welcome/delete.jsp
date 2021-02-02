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
	<jsp:useBean id="productDao" class = "wp.ProductRepository" scope = "session" />
	<%
		productDao.deleteProduct(request.getParameter("id"));	
		response.sendRedirect("product.jsp");
	%>
</body>
</html>