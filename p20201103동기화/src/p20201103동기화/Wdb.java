package p20201103동기화;

public class Wdb {

	public static void main(String[] args) {
		// 공유자원 Counter
		Counter c = new Counter();
		
		Thread t1 = new MyThread(c);
		Thread t2 = new MyThread(c);
		
		t1.start();
		t2.start();
	}

}
