<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*, wp.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page = "menu.jsp" />
	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3" align = "center">상품목록</h1>
		</div>
	</div>
	<jsp:useBean id="productDao" class = "wp.ProductRepository" scope = "session" />
	<%
		String id = request.getParameter("id");
		Product product = productDao.getProductById(id);
		if(product == null) {
	%>
		<jsp:forward page = "products.jsp" />			
	<% 
		}
	%>
	
	<div class = "container">
		<div class = "row" align = "center">
		<div class = "col-md-6">
			<img src = "../resources/images/<%=product.getProductImg() %>" style = "width:280px; height:150px">
		</div>
			<div class = "col-md-6">
				<h3><%= product.getName() %></h3>
				<p><%= product.getDescription() %></p>
				<p> <b>상품 코드 : </b> <span class = "badge badge-danger"><%=product.getProductId() %></span></p>
				<!-- badge badge-danger bootstrap 내장 클래스 -->
				<p> <b>제조사 : </b> <%=product.getManuFacturer() %></p>
				<p> <b>분류 : </b> <%=product.getCategory() %></p>
				<p> <b>재고수량 : </b> <%=product.getUnitsInStock() %></p>
				<h4><%=product.getUnitPrice() %> 원</h4>
				<p> <a href = # class = "btn btn-info">상품 주문&raquo;</a></p>
				<!-- btn btn-info bootstrap 내장 클래스 -->
				<a href = "products.jsp" class = "btn btn-secondary">상품 목록 &raquo;</a>
				<!-- btn btn-secondary bootstrap 내장 클래스 -->
				<a href = "delete.jsp?id=<%=product.getProductId() %>" class = "btn btn-secondary">상품 삭제 &raquo;</a>
			</div>

		</div>
	</div>
	<jsp:include page = "footer.jsp" />
	
	</body>
	</html>	