package wp;

public class AJSP {
	int count = 3;
	String makeItLower(String data) {
		return data.toLowerCase();
	}
	
	public void _jspService() {
		System.out.println("<TYPE html>");
		System.out.println("<html>\n" + "<head>");
		System.out.println("<meta charset=\"UTF-8\">");
		System.out.println("<title>Insert title here</title>\n" + 
		"</head>\n" + 
		"<body>\n" + 
		"<h3>Hello</h3>");
		
		for(int i = 0; i < count; i++) {
			System.out.println("Java Server Pages" + i + "<br>");
		}
		
		System.out.println(makeItLower("HELLO WORLD"));
	}
}
