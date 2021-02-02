package 폰트연습;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Wdb {

	public static void main(String[] args) {
		Myframe mf = new Myframe();
	}
}

class Myframe extends JFrame {
	public Myframe() {
		setSize(400, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Mypanel mp = new Mypanel();
		add(mp);
		setVisible(true);
	}
}

class Mypanel extends JPanel {
	Font f1, f2, f3;

	public Mypanel() {
		f1 = new Font("Helvetica", Font.PLAIN, 20);
		f2 = new Font("Helvetica", Font.BOLD, 20);
		f3 = new Font("Helvetica", Font.ITALIC, 20);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("Helvetica Font PLAIN", 10, 30);
		
		g.setFont(f2);
		g.drawString("Helvetica Font BOLD", 10, 60);
		
		g.setFont(f3);
		g.drawString("Helvetica Font ITALIC", 10, 90);
	}
	
}
