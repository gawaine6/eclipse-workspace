package 자바연습;

class Print1{
	public String delimiter;
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
}

public class staticMethod {

	public static void main(String[] args) {
		//Print1.a("="); 메소드가 클래스 소속일 때는 static이 있어야한다
		//Print1.b("=");
		
		// Print1의 분신인 t1, 정확하게 말하면 Print1의 인스턴스인 t1
		Print1 t1 = new Print1();
		t1.delimiter = "=";
		t1.a(); // 메소드가 인스턴스 소속일 때는 static을 빼줘야한다
		t1.b();
		t1.c("$");
		//Print1.a("^");
		//Print1.b("^");
		
		Print1 t2 = new Print1();
		t2.delimiter = "^";
		t2.a();
		t2.b();
		t2.c("%");
	}

}
