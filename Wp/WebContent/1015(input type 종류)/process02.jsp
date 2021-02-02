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
		// String[] hobbyList = {"독서", "운동", "영화"};
		request.setCharacterEncoding("utf-8");
		String[] hobbies = request.getParameterValues("hobby");
		if(hobbies == null) {
			out.print("<p>당신의 인생에 취미란 없습니껴</p>");
			return;
		}
		out.print("<p>당신의 취미는 ");
		String str = "";
		for(int i = 0; i < hobbies.length; i++) {
		//	if(hobbies[i].equals("on"))
				str = str + "[" + hobbies[i] + "]";
		}
		out.print(str + "입니드</p>");
	%>
</body>
</html>