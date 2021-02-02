<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@ page import = "com.oreilly.servlet.MultipartRequest"%>
<%@ page import = "wp.*" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품등록처리</title>
</head>
<body>
	<jsp:useBean id="productDao" class = "wp.ProductRepository" scope = "session"/>
	<!-- 세숀세숀 :  -->
	<%
		request.setCharacterEncoding("utf-8");
		
		/* String imgFolder = "./resources/images";
		String realPath = request.getServletContext().getRealPath(imgFolder);
		System.out.println("folder path : " + realPath); */
		int maxSize = 10 * 1024 * 1024;
		MultipartRequest mprq = new MultipartRequest(request, "/Users/k/eclipse-workspace/Wp/WebContent/Welcome/resources/images/", maxSize, "utf-8", new DefaultFileRenamePolicy());
		
		String productId = request.getParameter("productId");
		String name = request.getParameter("name");
		String unitPrice = request.getParameter("unitPrice");
		String description = request.getParameter("description");
		String manuFacturer = request.getParameter("manuFacturer");
		String category = request.getParameter("cataegory");
		String unitsInStock = request.getParameter("unitsInStock");
		String quality = request.getParameter("quality");
		// 사진 추가
		String productImg = mprq.getFilesystemName("productImg");
		// 사진 추가 끝
		// Product.java 에 보면 price, unitStock이 다 문자열이다, 그걸 정수형으로 바꿔줍니다
		int price;
		
		if (unitPrice == null || unitPrice.isEmpty()) {
			price = 0;
		} else 
			price = Integer.parseInt(unitPrice);
		
		int stock;
		
		if (unitsInStock == null || unitsInStock.isEmpty()) {
			stock = 0;
		} else 
			stock = Integer.parseInt(unitsInStock);
				
		Product newProduct = new Product(productId, name, price);
		newProduct.setDescription(description);
		newProduct.setManuFacturer(manuFacturer);
		newProduct.setCategory(category);
		newProduct.setUnitsInStock(stock);
		// 난 Product.java에서 long으로 줘서 String으로 바꿔줘야합니다 위에서 정수형으로 바꾼 것을 stock으로 정의했으니 매개변수로 stock이 들어가야합니다
		newProduct.setQuality(quality);
		
		if(productImg == null)
			newProduct.setProductImg(productImg);
		
		productDao.addProduct(newProduct);
		
		response.sendRedirect("products.jsp");
		// 기존에 있던 게 삭제되거나 변경되었을 때 리다이렉션을 사용한다
	%>
</body>
</html>