package p20201103스레드;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CarGame extends JFrame{
	private JLabel lb1;
	private JLabel lb2;
	private JLabel lb3;
	
	int x1 = 100, x2 = 200, x3 = 300;
	int y1 = 10, y2 = 20, y3 = 30;
	
	class MyThread extends Thread {
		public void run() {
			for(int i = 0; i < 120; i++) {
				try {
					Thread.sleep(100);
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
				x1 += (int)(Math.random() * 10);
				y1 += (int)(Math.random() * 10);
				
				x2 += (int)(Math.random() * 10);
				y2 += (int)(Math.random() * 10);
				
				x3 += (int)(Math.random() * 10);
				y3 += (int)(Math.random() * 10);
				
				lb1.setBounds(x1, y1, 100, 100);
				lb2.setBounds(x2, y2, 100, 100);
				lb3.setBounds(x3, y3, 100, 100);
				
			}
		}
	}
	public CarGame() {
		setTitle("CarGame");
		setSize(600, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		
		lb1 = new JLabel();
		lb1.setText("kia");
		lb1.setIcon(new ImageIcon("/Users/k/Desktop/car1.jpg"));
		
		lb2 = new JLabel();
		lb2.setText("Nissan");
		lb2.setIcon(new ImageIcon("/Users/k/Desktop/car2.jpg"));
		
		lb3 = new JLabel();
		lb3.setText("Ferrari");
		lb3.setIcon(new ImageIcon("/Users/k/Desktop/car3.jpg"));
		
		add(lb1);
		add(lb2);
		add(lb3);
		
		lb1.setBounds(100, 0, 100, 100);
		lb2.setBounds(100, 50, 100, 100);
		lb3.setBounds(100, 100, 100, 100);
		
		(new MyThread()).start();
		setVisible(true);
	}
	
	public static void main(String[] args) {
		CarGame c = new CarGame();
	}

}
