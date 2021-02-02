<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.*, wp.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>제품 목록</title>
</head>
<body>
	<jsp:include page = "menu.jsp" />
	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3" align = "center">상품목록</h1>
		</div>
	</div>
	<jsp:useBean id="productDao" class = "wp.ProductRepository" scope = "session" />
	<!-- 웹은 요청과 응답의 연속
		a.jsp를 요청한다
		서버 딴에서 jsp를 수행하고 만들어진 html을 보내주고
		웹브라우저에서 보여진다
		
		웹서버 메모리 공간 안에는
		페이지 영역, 리퀘스트 영역, 세션 영역 등이 존재한다
		페이지를 요청하면 페이지 영역과 리퀘스트 영역이 만들어진다
		내가 세션에 정보를 넣는 작업을 하면 세션 영역 안에 정보가 들어간다 
		세션 영역은 일정 시간 동안 요청이 이루어지지 않으면 자동으로 소멸한다 -->
	<%
		ArrayList<Product> productList = productDao.getAllProducts();
	%>
	
	<div class = "container">
		<div class = "row" align = "center">
			<%
			// for-each문
			// productList에 있는 값을 product에 대입해서 루프
				for (Product product : productList) {
			%>
			<div class = "col-md-6">
				<img src = "../resources/images/<%= product.getProductImg() %>" style = "width:280px; height:150px"> 
				<!-- 그냥 product.getProductImg() 하면 엑박뜬다, 실행해서 코드를 보면 파일 이름만 덜렁 나오는데 파일의 정확한 경로를 안줘서 그렇다, 그래서 엑박이 뜨는 겁니다잉-->
				<h3><%= product.getName() %></h3>
				<p><%= product.getDescription() %></p>
				<p><%= product.getUnitsInStock() %></p>
				<p><%= product.getUnitPrice() %></p>
				<p> <a href = "product.jsp?id=<%= product.getProductId() %>" class = "btn btn-secondary" role = "button">상세정보&raquo;</a></p>
				<!-- btn btn-secondary bootstrap 내장 클래스 -->
			</div>
			<%
				}
			%>
		</div>
	</div>
	<jsp:include page = "footer.jsp" />
</body>
</html>