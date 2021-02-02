package p20201006그림그리기;

import javax.swing.JFrame;

public class ColorTestFrame extends JFrame {
	public ColorTestFrame(String name) {
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(name);
		setVisible(true);
		MyPanel1Color panel = new MyPanel1Color();
		add(panel);
	}
}
