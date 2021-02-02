package p20201110애벌레;

import javax.swing.JFrame;

public class Myframe extends JFrame {
	Myframe() {
		setTitle("뭐요");
		setSize(900, 900);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mypanel p = new Mypanel();
		add(p);
		setVisible(true);
	}
}
