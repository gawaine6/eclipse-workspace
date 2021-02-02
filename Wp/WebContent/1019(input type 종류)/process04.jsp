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
	<table border = "1">
		<tr>
			<th>요청 파라미터 이름</th>
			<th>요청 파라미터 값</th>
		</tr>
		<%
			request.setCharacterEncoding("utf-8");
			Enumeration<String> paramNames = request.getParameterNames();
			while(paramNames.hasMoreElements()) {
				String name = paramNames.nextElement();
				out.print("<tr>");
				out.print("<td>" + name + "</td>");
				String value = request.getParameter(name);
				out.println("<td>" + value + "</td>");
				out.print("</tr>");
			}
		%>
	</table>
</body>
</html>

<!-- 
Enumeration : 데이터 추출
Enumeration<String> 이름 = 받아올거, 여기선 request 된 파라미터들
hasMoreElements() : 읽어올 요소가 남아있는지 확인. 있으면 true, 없으면 false. Iterator의 hasNext()와 같음
nextElement() : 다음 요소를 읽어 옴. Iterator의 next()와 같음 (jdbc의 ResultSet)
 -->