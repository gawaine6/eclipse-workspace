package p20201103스레드;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for(int i = 100; i > 0; i--) {
			System.out.println(i);
		}
	}

}
