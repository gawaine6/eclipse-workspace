package wp;

import java.util.Scanner;

public class WebServer {

	public static void main(String[] args) {
		AJSP ajsp = null;
		BJSP bjsp = null;
		while(true) {
			
			/*
			 * 1. 인터넷 너머에서 오는 클라이언트 요청을 기다린다
			 * 2. 요청이 오면 그 요청을 분석해서 원하는 웹 컴포넌트를 실행
			 * 	  웹 컴포넌트 : html, jsp, servlet etc
			 */
			
			String req = getRequest();
			if(req.contentEquals("A.jsp")) {
				if(ajsp == null) {
					ajsp = new AJSP();
				}
				ajsp._jspService();
			} else if(req.contentEquals("B.jsp")) {
				if(bjsp == null) {
					bjsp = new BJSP();
				}
				bjsp._jspService();
			} else {
				System.out.println("404 not found");
			}
		}
	}
	
	static String getRequest() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Request : ");
		String req = scan.nextLine();
		return req;
	}
}
