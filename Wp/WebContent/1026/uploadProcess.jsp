<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		// 1. MultipartRequest 객체 생성
		MultipartRequest mprq = new MultipartRequest(request, "/Users/k/eclipse-workspace/Wp/WebContent/1026/upload", 1024 * 1024 * 10, "utf-8", new DefaultFileRenamePolicy());
		
		// 2. 일반 파라미터(input type이 file이 아닌 파라미터) 값과 파일 파라미터 추출
		String name1 = mprq.getParameter("name1");
		String title1 = mprq.getParameter("title1");
		String serverFileName1 = mprq.getFilesystemName("file1");
		
		String name2 = mprq.getParameter("name2");
		String title2 = mprq.getParameter("title2");
		String serverFileName2 = mprq.getFilesystemName("file2");
		
		String name3 = mprq.getParameter("name3");
		String title3 = mprq.getParameter("title3");
		String serverFileName3 = mprq.getFilesystemName("file3");
		
		
	%>
		<!-- 3. 추출한 파라미터 값을 테이블로 표시 -->
		<table border = 1>
		<tr>
			<td width = "100">이름</td>
			<td width = "100">제목</td>
			<td width = "100">파일</td>
		</tr>
		<tr>
			<td><%=name1 %></td>
			<td><%=title1 %></td>
			<td><%=serverFileName1 %></td>
		</tr>
		<tr>
			<td><%=name2 %></td>
			<td><%=title2 %></td>
			<td><%=serverFileName2 %></td>
		</tr>
		<tr>
			<td><%=name3 %></td>
			<td><%=title3 %></td>
			<td><%=serverFileName3 %></td>
		</tr>
		</table> 
</body>
</html>