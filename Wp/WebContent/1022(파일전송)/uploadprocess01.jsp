<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*"%>
<%@ page import="com.oreilly.servlet.multipart.*"%>
<%@ page import="java.util.Enumeration"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>File Upload</title>
</head>
<body>
	<%
		MultipartRequest mpq = new MultipartRequest(request, "/Users/k/eclipse-workspace/Wp/WebContent/1022(파일전송)/upload",
			1024 * 1024 * 5, "utf-8", new DefaultFileRenamePolicy());
		// request 객체, 저장될 경로, 파일 최대 크기, 인코딩 방식, 같은 이름 파일명 방지 처리

		// String fileNames = mpq.getParameter("fileNames"); 요렇게 하면 null 나옴
		// String fileNames = mpq.getFileNames(); 파일이름을 가져오는 getFileNames() 근데 이거 하면 Enumeration 필요, 그래서 import 시켜준다
		
		Enumeration<String> params = mpq.getParameterNames(); // request.getParameterNames(); 해도 됨
		// Enumeration<String>을 이용하면 .nextElements()에서 따로 형 변환없이 String 변수에 저장할 수 있다
		// 요청하는 페이지에서 title 이라는 파라미터를 선언했다
		while (params.hasMoreElements()) { // params에 요소가 남아있으면
			String name = params.nextElement(); // params의 다음 요소를 읽어온다, 이건 test01.jsp에서 선언한 title이 오게된다
			String value = mpq.getParameter(name); // request.getParameter(name); 해도 됨
			out.println(name + " : " + value + "<br>");
		}
		out.println("---------------------------------------------<br>");
		
		Enumeration<String> files = mpq.getFileNames(); // mpq에 요청된 파일들의 이름을 가져온다
		while(files.hasMoreElements()) {
			String paramNames = files.nextElement(); // files에 있는 다음 요소를 불러온다, 여기서는 test01.jsp에서 선언한 fileName이 오게된다
			String serverFileName = mpq.getFilesystemName(paramNames);
			String originalName = mpq.getOriginalFileName(paramNames);
			String type = mpq.getContentType(paramNames);
			File file = mpq.getFile(paramNames);

			out.println("Request Parameter Names : " + paramNames + "<br>");
			out.println("Server File Names : " + serverFileName + "<br>");
			out.println("Original File Names : " + originalName + "<br>");
			out.println("File Content Type : " + type + "<br>");
			
			if(file != null) {
				out.println("File Size : " + file.length() + "<br>");
			}
		}
	%>
</body>
</html>

<!-- 
	MultiPartRequest를 사용하면 톰캣의 getParameter 메소드를 이용해 값을 전달 받지 못한다
	MultiPartRequest를 사용하면서 값을 전달 받으려면 MultiPartRequest 객체에 getParameter 메소드를 사용해서 값을 전달 받아야 한다
	String name = (MultiPartRequest 객체 이름).getParameter

 -->