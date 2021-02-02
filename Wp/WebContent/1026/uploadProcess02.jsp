<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="java.util.Enumeration"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	/* 
	while문 돌면서 일반 파라미터들을 추출해봅시다(name, title)
	while문 돌면서 파일 파라미터들을 추출해봅시다(file)
	다 추출하고 나면 그걸 테이블에 넣어봅시다
	*/
	MultipartRequest mprq = new MultipartRequest(request, "/Users/k/eclipse-workspace/Wp/WebContent/1026/upload", 1024 * 1024 * 10, "utf-8", new DefaultFileRenamePolicy());
	request.setCharacterEncoding("utf-8");
	%>
	<table border = 1>
		<tr>
			<td width = "100">이름</td>
			<td width = "100">제목</td>
			<td width = "100">파일</td>
		</tr>
	<%
	Enumeration<String> params = mprq.getParameterNames();
	Enumeration<String> files = mprq.getFileNames();
	while(files.hasMoreElements()) {
		String fileParamName = files.nextElement(); // 파일의 파라미터 이름들
		String serverFileName = mprq.getFilesystemName(fileParamName);
		
		String param1 = params.nextElement();
		String param1Value = mprq.getParameter(param1);
		
		String param2 = params.nextElement();
		String param2Value = mprq.getParameter(param2);
	%>
	<tr>
		<td><%=param1 %></td>
		<td><%=param2 %></td>
		<td><%=serverFileName %></td>
	</tr>
	<%
	}
	%>
	</table>
</body>
</html>