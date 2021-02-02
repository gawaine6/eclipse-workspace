package p20201103스레드;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
	private JLabel label;
	
	public class MyThread1 extends Thread {
		public void run() {
			for(int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i + "");
			}
		}
	}
	
	public CountDownTest() {
		setTitle("CountDown");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label = new JLabel("start");
		label.setFont(new Font("Helvetica", Font.BOLD, 100));
		add(label);
		(new MyThread1()).start(); // 스레드를 시작한다
		setVisible(true);
	}

}
