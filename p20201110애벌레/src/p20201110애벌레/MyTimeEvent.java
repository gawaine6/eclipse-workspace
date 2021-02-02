package p20201110애벌레;

import java.util.TimerTask;

public class MyTimeEvent extends TimerTask {
	static int count = 0;
	Mypanel mpanel;
	public MyTimeEvent(Mypanel mypanel) {
		mpanel = mypanel;
	}
	@Override
	public void run() {
		System.out.println(count++);
//		mpanel.auto();
		mpanel.autoPlay();
	}

}
