<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- form03.jsp에서 받은 값들을 테이블 형태로 표현 -->
	<table border = 1>
		<tr>
			<th>Parameter Name</th>
			<th>Parameter Value</th>
		</tr>
		
		<%
			request.setCharacterEncoding("utf-8");
			Enumeration<String> paramName = request.getParameterNames(); // 파라미터들 이름
			while(paramName.hasMoreElements()) {
				String name = paramName.nextElement(); // 파라미터들 이름을 읽어온다
				out.print("<tr>");
				out.print("<td>" + name + "</td>");
				String value = request.getParameter(name); // 위에서 받아온 파라미터의 값들
				out.print("<td>" + value + "</td>");
			}
		%>
	</table>
</body>
</html>