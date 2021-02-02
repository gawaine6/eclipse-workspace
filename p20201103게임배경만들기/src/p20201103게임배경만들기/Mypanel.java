package p20201103게임배경만들기;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Mypanel extends JPanel {

	@Override
	protected void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		g.setColor(Color.red);
		g.fillRect(10, 10, 100, 100);

	}
	
}
