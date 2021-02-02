<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

	<%
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int result = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		request.setAttribute("result", result); 
		// Attribute로 보낼 때는 반드시 객체여야 하는데 위에서 Integer를 해서 괜츈괜츈
		// request.setAttribute("객체명", 객체);
		// 여기서 받아간 객체명은 request.getAttribute("객체명")로 사용된다(process05.jsp);
		// response.sendRedirect("process05.jsp");
	%>
	<jsp:forward page = "process04-1.jsp" /> 
	<!-- process05.jsp로 forwarding -->
	<!-- 리다이렉션이라는 방법도 있다 포워딩은 클라이언트가 모름 request06.jsp gogo-->
	
	
	<!--
	포워딩을 하면 request 객체 안에서 활동이 이루어지지만
	리다이렉션을 받으면 내가 처음에 request 한 객체는 사라지고
	새롭게 요청한 것에 대한 request 객체가 만들어져서
	처음에 request 받은 객체에 대한 내용은 전부 사라지게 된다
	 -->