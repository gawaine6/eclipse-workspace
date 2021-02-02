<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	Data : 
	<%! int Data = 0; %>
	<%  Data = Data + 1;
		out.println(Data + "<br>"); %>	
	
	String UpperCase : 
	<%!
		String makeItUpper(String s) {
			return s.toUpperCase();
	}
	%>
	
	<%=makeItUpper("abcdefg<br>") %>
	
	<%!
		int sum(int n1, int n2) {
		return n1 + n2;
	}
	%>
	
	<%="합은 " + sum(4, 5) %>
</body>
</html>