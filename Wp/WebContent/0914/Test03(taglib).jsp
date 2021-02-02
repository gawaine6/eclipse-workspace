<!-- tablib에 대해 알아봅시다 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3> 스크립틀릿 태그를 이용한 출력 </h3>
	<%
		for(int i = 0; i <= 10; i++)
			out.println(i);
	%>
	<hr>
	<h3> JSTL 태그를 이용한 출력 </h3>
	<c:forEach begin = "1" end = "10" step = "1" var = "k">
		<c:out value = "${k}" />
	</c:forEach>
	<!-- 시작은 1부터, 끝은 10까지, 단계는 1씩, 변수이름은 k -->
</body>
</html>