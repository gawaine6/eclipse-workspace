<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<form action = " process01.jsp" method = "post" enctype = "multipart/form-data"> <!-- 업로드할 때는 반드시 enctype = "multipart/form-data" 가 들어가야한다 -->
		<p>Title : <input type = "text" name = "title"> </p>
		<p>File : <input type = "file" name = "fileName"> </p>
		<p><input type = "submit" value = "trasmit"></p>
	</form>
</body>
</html>