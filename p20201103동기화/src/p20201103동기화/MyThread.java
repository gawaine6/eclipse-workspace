package p20201103동기화;

public class MyThread extends Thread {
	Counter sharedCounter;
	
	public MyThread(Counter c) {
		sharedCounter = c;
	}

	@Override
	public void run() {
		for(int i = 0; i < 20000; i++) {
			sharedCounter.increment();
			
			if(i % 40 == 0) {
				sharedCounter.print();
			}
			double b = Math.random(); // 0~1 사이 실수
			b = b * 3; // 0~3 사이 실수
			try {
				sleep((int)b);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sharedCounter.decrement();
		}
		System.out.println("thread out");
		sharedCounter.print();
	}
}
