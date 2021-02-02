package 자바연습;

class Foo {
	public static String classVar = "I class var";
	public String instanceVar = "I instance var"; 
	public static void classMethod() {
		System.out.println(classVar); // o
		// System.out.println(instanceVar); // x
	}
	public void instanceVar() {
		System.out.println(classVar); // o
		System.out.println(instanceVar); // ok
	}
}

public class StaticApp {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Foo.classVar); // Ok
		// System.out.println(Foo.instanceVar); // Error
		Foo.classMethod();
		// Foo.instanceMethod();
		
		Foo f1 = new Foo();
		Foo f2 = new Foo();
		
		System.out.println(f1.classVar);
		System.out.println(f1.instanceVar);
		
		f1.classVar = "changed by f1";
		System.out.println(f1.classVar);
		System.out.println(f2.classVar);
		
		f1.instanceVar = "changed by f1";
		System.out.println(f1.instanceVar);
		System.out.println(f2.instanceVar);
	}

}
