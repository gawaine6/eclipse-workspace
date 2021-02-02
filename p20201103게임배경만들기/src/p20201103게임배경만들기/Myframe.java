package p20201103게임배경만들기;

import javax.swing.JFrame;

public class Myframe extends JFrame {
	Myframe() {
		setTitle("game back");
		setSize(400, 300);
		Mypanel p = new Mypanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(p);
		setVisible(true);
	}
}
