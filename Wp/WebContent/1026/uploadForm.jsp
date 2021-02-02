<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>file upload</title>
</head>
<body>
	<form action = "uploadProcess02.jsp" method = "post" enctype = "multipart/form-data">
		<p> Name 1 : <input type = "text" name = "name1"> 
			Title 1 : <input type = "text" name = "title1"> 
			File 1 : <input type = "file" name = "file1">
		</p>
		
		<p> Name 2 : <input type = "text" name = "name2"> 
			Title 2 : <input type = "text" name = "title2"> 
			File 2 : <input type = "file" name = "file2">
		</p>
		
		<p> Name 3 : <input type = "text" name = "name3"> 
			Title 3 : <input type = "text" name = "title3"> 
			File 3 : <input type = "file" name = "file3">
		</p>
		<p><input type = "submit" value = "File Upload"></p>
	</form>
</body>
</html>