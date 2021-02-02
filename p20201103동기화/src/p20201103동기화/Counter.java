package p20201103동기화;

public class Counter {
	private int value = 0;
	
	public void increment() {
		value++;
	}
	public void decrement() {
		value--;
	}
	public void print() {
		System.out.println(value);
	}
}
