<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		request.setAttribute("result", result);
	%>
	<jsp:forward page = "process04-1.jsp" />
	<!-- 결과를 process04-1.jsp로 보낸다 -->