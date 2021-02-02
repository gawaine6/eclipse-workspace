package 자바연습;

class Accounting {
	public double valueOfSupply;
	public static double varRate = 0.1;
	public Accounting(double valueOfSupply) {
		this.valueOfSupply = valueOfSupply;
		// this는 public double valueofSupply
		// 뒤에 valueOfSupply는 매개변수
	}
	public double getVAT() {
		return valueOfSupply * varRate;
	}
	public double getTotal() {
		return valueOfSupply + getVAT();
	}
}
public class AccountingApp {

	public static void main(String[] args) {
		Accounting a1 = new Accounting(10000.0);
		// 만약에 인스턴스가 생성될 때 내부적으로 꼭 가져야할 값을 생성자 레벨에서 만들어버리고 싶다면
		
		Accounting a2 = new Accounting(10000.0);
		a2.valueOfSupply = 10000.0;
		
		System.out.println("Value of supply : " + a1.valueOfSupply);
		System.out.println("Value of supply : " + a2.valueOfSupply);
		
		System.out.println("Vat : " + a1.getVAT());
		System.out.println("Vat : " + a2.getVAT());
		
		System.out.println("Total : " + a1.getTotal());
		System.out.println("Total : " + a2.getTotal());
		
//		Accounting.valueOfSupply = 10000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		System.out.println("Vat : " + Accounting.getVAT());
//		System.out.println("Total : " + Accounting.getTotal());
//		
//		Accounting.valueOfSupply = 20000.0;
//		System.out.println("Value of supply : " + Accounting.valueOfSupply);
//		System.out.println("Vat : " + Accounting.getVAT());
//		System.out.println("Total : " + Accounting.getTotal());
	}

}
