<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%request.setCharacterEncoding("utf-8"); %>
	<p> 독서 : <%= request.getParameter("hobby1") %> </p>
	<p> 운동 : <%= request.getParameter("hobby2") %> </p>
	<p> 영화 : <%= request.getParameter("hobby3") %> </p>
</body>
</html>