package wp;

public class BJSP {
	String makeItUpper(String data) {
		return data.toUpperCase();
	}
	void _jspService() {
		System.out.println("<TYPE html>");
		System.out.println("<html>\n" + "<head>");
		System.out.println("<meta charset=\"UTF-8\">");
		System.out.println("<title>Insert title here</title>\n" + 
		"</head>\n" + 
		"<body>\n" + 
		"<h3>RoofTopCat</h3>");
		
		System.out.println("Java Server Pages");

		System.out.println(makeItUpper("good bye"));
	}
}
