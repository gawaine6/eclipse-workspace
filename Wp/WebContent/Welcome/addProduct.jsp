<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 추가</title>
<script type = "text/javascript" src = "./resources/js/validation.js"></script>
</head>
<body>
	<%
		if(request.getParameter("language") != null) { %>
		
			<fmt:setLocale value = '<%=request.getParameter("language") %>' />
	<%
		}
	%>
	<fmt:setBundle basename = "resourceBundle.message" var = "message" />
	<%@ include file = "menu.jsp" %>
	<div class = "jumbotron">
		<div class = "container">
			<h1 class = "display-3" align = "center">상품목록</h1>
		</div>
	</div>
	
	<div class = "container">
		<form name = "newProduct" action = "processAddProduct.jsp" class = "form-horizontal" method = "post" enctype = "multipart/form-data">
		<!-- multipart/form-data가 있는 이유는 제품을 등록할 때 사진도 올려줘야되니까 있는거 -->
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "productId" bundle = "${message}" />상품 코드</label>
				<div class = "col-sm-3">
					<input type = "text" name = "productId" id = "productId" class = "form-control">
				</div>
			</div>
			<div class = "container">
				<div class = "text-align">
					<a href = "?language=ko">Korean</a> <a href = "?language=en">English</a>
				</div>
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "name" bundle = "${message}" />상품명 </label>
				<div class = "col-sm-3">
					<input type = "text" name = "name" id = "name" class = "form-control">
				</div>
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "unitPrice" bundle = "${message}" />가격</label>
				<input type = "text" name = "unitPrice" id = "unitPrice" class = "form-control">
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "description" bundle = "${message}" />상세 정보</label>
				<input type = "text" name = "description" class = "form-control">
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "manufacturer" bundle = "${message}" />제조사</label>
				<input type = "text" name = "manuFacturer" class = "form-control">
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "category" bundle = "${message}" />분류</label>
				<input type = "text" name = "category" class = "form-control">
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "unitsInStock" bundle = "${message}" />재고 수</label>
				<input type = "text" name = "unitsInStock" id = "unitsInStock" class = "form-control">
			</div>
			
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "quality" bundle = "${message}" />상태</label>
				<div class = "col-sm-4">
					<input type = "radio" name = "quality" value = "New"><fmt:message key = "qualityNew" bundle = "${message}" />신규&nbsp;
					<input type = "radio" name = "quality" value = "Used"><fmt:message key = "qualityUsed" bundle = "${message}" />중고&nbsp;
					<input type = "radio" name = "quality" value = "Refurbished"><fmt:message key = "qualityRefurbished" bundle = "${message}" />리퍼
				</div>
			</div>
			<!-- 새로 추가하는 부분 -->
			<div class = "form-group row">
				<label class = "col-sm-2"><fmt:message key = "productImage" bundle = "${message}" />사진</label>
				<div class = "col-sm-5">
					<input type = "file" name = "productImg" class = "form-control">
				</div>
			</div>
			<!-- 여기까지 -->
			<div class = "form-group row">
				<div class = "col-sm-offset-2 col-sm-10">
					<input type = "button" class = "btn btn-primary" value = '<fmt:message key = "register" bundle = "${message}" />' onclick = "checkAddedProduct()">
				</div>
			</div>
		</form>
	</div>
	<hr>
	<jsp:include page = "footer.jsp" />
</body>
</html>