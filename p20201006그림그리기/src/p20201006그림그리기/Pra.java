package p20201006그림그리기;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Pra extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.yellow);
		g.fillOval(20, 30, 150, 100);
		g.setColor(Color.black);
		g.drawArc(50, 60, 30, 30, 180, -180);
		g.drawArc(110, 60, 30, 30, 180, -180);
		g.drawArc(65, 65, 60, 60, -180, 180);
		g.setColor(Color.red);
		g.fillOval(135, 90, 10, 10);
		g.fillOval(45, 90, 10, 10);
		g.setColor(Color.black);
		g.drawString("Bae Soon Chul", 80, 150);
	}
	
}
