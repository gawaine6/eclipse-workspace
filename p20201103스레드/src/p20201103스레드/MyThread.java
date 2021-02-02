package p20201103스레드;

public class MyThread extends Thread {

	@Override
	public void run() {
		
		super.run();
		for(int i = 0; i < 100; i++)
			System.out.println(i);
	}
}
