package 자바연습;

class Print {
	public String delimiter = "";
	// static이 붙으면 뒤에 오는 애가 클래스 소속이라는 소리다
	// 근데 인스턴스에 소속시켜주고 싶다면 static을 지워야한다
	// 인스턴스를 선언하는 방법
	// 클래스명 변수이름 = new 클래스명();
	public void A() {
		System.out.println(delimiter);
		System.out.println(12345);
		System.out.println(67890);
	}
	
	public void B() {
		System.out.println(delimiter);
		System.out.println("asdfg");		
		System.out.println("qwert");
	}
}