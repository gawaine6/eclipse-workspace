<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Result1 : <%= request.getParameter("num1") %> + <%= request.getParameter("num2") %> = <%= request.getAttribute("result1") %> <br>
Result2 : <%= request.getParameter("num1") %> - <%= request.getParameter("num2") %> = <%= request.getAttribute("result2") %> <br>
Result3 : <%= request.getParameter("num1") %> / <%= request.getParameter("num2") %> = <%= request.getAttribute("result3") %> <br>
Result4 : <%= request.getParameter("num1") %> * <%= request.getParameter("num2") %> = <%= request.getAttribute("result4") %>
</body>
</html>