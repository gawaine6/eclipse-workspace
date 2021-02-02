<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "com.oreilly.servlet.*" %>
<%@ page import = "com.oreilly.servlet.multipart.*" %> <!-- 파일 업로드 할거면 두개 다 써줘야한다 이마리야 -->
<%@ page import = "java.util.*" %> <!-- Enumeration 때문에 해줘야댐 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<%
		MultipartRequest mreq = new MultipartRequest(request, "/Users/k/eclipse-workspace/Wp/WebContent/1022(파일전송)/upload", 
								1024*1024*5, "utf-8", new DefaultFileRenamePolicy()); // 존나 기네 슈발
		String title = mreq.getParameter("title");
		out.println("<h3>" + title + "</h3>");
		
		Enumeration<String> fileNames = mreq.getFileNames(); // getParameter로 하면 null, 그래서 파일이름을 가져와주는 getFileNames()를 써준다
		String paramName = fileNames.nextElement();
		String originalFileName = mreq.getOriginalFileName(paramName); // 이 파라미터로 전송된 파일의 원래 이름은 뭐였니
		String serverFileName = mreq.getFilesystemName(paramName); // 이 파라미터로 전송된 파일이 서버에는 어떤 이름으로 저장됐니
		
		out.println("File Parameter Name : " + paramName + "<br>");
		out.println("Client File Name : " + originalFileName + "<br>");
		out.println("Server File Name : " + serverFileName + "<br>");
		/* 
		Enumeration : 데이터 추출
		Enumeration<String> 이름 = 받아올거 :  여기선 request 된 파라미터들
		hasMoreElements() : 읽어올 요소가 남아있는지 확인. 있으면 true, 없으면 false. Iterator의 hasNext()와 같음
		nextElement() : 다음 요소를 읽어 옴. Iterator의 next()와 같음 (jdbc의 ResultSet)
		*/						
	%>
</body>
</html>