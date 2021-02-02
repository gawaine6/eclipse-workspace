package 자동차이벤트;

import javax.swing.JFrame;

public class MyCarFrame extends JFrame {
	public MyCarFrame(String name) {
		this.setSize(1000, 1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(name);
		add(new MyCarPanel());
		this.setVisible(true);
	}
}
