<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		request.setCharacterEncoding("utf-8");
		String[] hobbies = request.getParameterValues("hobby");
		if(hobbies == null) {
			out.print("<p>No Jam Life</p>");
			return;
		}
		out.print("<p>Your hobby ");
		String str = "";
		for(int i = 0; i < hobbies.length; i++) {
			str = str + "{" + hobbies[i] + "}";
		}
		out.print(str + "DES!!");
	%>
</body>
</html>