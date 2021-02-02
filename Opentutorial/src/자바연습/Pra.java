package 자바연습;

public class Pra {
	public static void main(String[] args) {
		// Myframe f = new Myframe("hello"); 
		// Myframe 이라는 클래스에 hello를 저장해서 변수 f에 담겠다는 상태
		// p1, p2는 Print 이라는 클래스의 '인스턴스'
		// new를 가지면 무조건 인스턴스 
		Print p1 = new Print();
		p1.delimiter = "-----";
		p1.A();
		p1.A();
		p1.B();
		p1.B();
		
		Print p2 = new Print();
		p2.delimiter = "*****";
		p2.A();
		p2.A();
		p2.B();
		p2.B();
		
	}
	
}
