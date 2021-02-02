package p20201013폰트;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	Font f1, f2, f3, f4, f5, f6;
	
	// 생성자
	public MyPanel() {
		f1 = new Font("Serif", Font.PLAIN, 20);
		f2 = new Font("San Serif", Font.BOLD, 20);
		f3 = new Font("Monospaced", Font.ITALIC, 20);
		f4 = new Font("Dialog", Font.BOLD | Font.ITALIC, 20);
		f5 = new Font("휴먼명조", Font.BOLD, 20);
		f6 = new Font("휴먼둥근헤드라인", Font.BOLD, 20);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setFont(f1);
		g.drawString("Serief Font 20 point PLAIN", 10, 50);
		
		g.setFont(f2);
		g.drawString("San Serief Font 20 point BOLD", 10, 80);
		
		g.setFont(f3);
		g.drawString("Monospaced Font 20 point ITALIC", 10, 110);
		
		g.setFont(f4);
		g.drawString("Dialog Font 20 point BOLD, ITALIC", 10, 140);
		
		g.setFont(f5);
		g.drawString("휴먼명조 Font 20 point BOLD", 10, 170); // 맥에 없다링
		
		g.setFont(f6);
		g.drawString("휴먼둥근헤드라인 Font 20 point BOLD", 10, 200); // 맥에 없다링
	}
	
}
