package p20201103스레드;

public class Wdb {

	public static void main(String[] args) {
		// Thread 클래스를 상속받아서 구현
		Thread t1 = new MyThread();
		Thread t2 = new Thread(new MyRunnable());
		t1.start();
		t2.start();

		// Runnable 인터페이스를 상속하여 Thread 구현
		// Thread t1 = new Thread(new MyRunnable());
		// t1.start();
		
		CountDownTest cnt = new CountDownTest();
//		for(int i = 0; i < 100; i++) {
//			int x = (int)(Math.random() * 10 % 3) + 1;
//			System.out.println(i + "번 : " + x);
//		}
	}

}
