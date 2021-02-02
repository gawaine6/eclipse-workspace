package p20201110애벌레;

import java.awt.Color;
import java.awt.Graphics;

public class Myrect {
	private int[] xPoints;	// x좌표의 배열
	private int[] yPoints;	// y좌표의 배열
	private int nPoints;
	private Color myColor;
	static final int SIZE = 4;
	
	public Myrect(int[] x, int[] y, int count, Color color) {
		xPoints = new int[SIZE];
		yPoints = new int[SIZE];
		nPoints = count;
		myColor = color;
		
		for(int j = 0; j < 4; j++) {
			xPoints[j] = x[j];
			yPoints[j] = y[j];
		}
	}
	
	public Myrect() {
		xPoints = new int[SIZE];
		yPoints = new int[SIZE];
		nPoints = SIZE;
		myColor = Color.red;
		
		xPoints[0] = 10;
		xPoints[1] = 60;
		xPoints[2] = 60;
		xPoints[3] = 10;
		
		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 60;
		yPoints[3] = 60;
				
	}
	public void setMyColor(Color myColor) {
		this.myColor = myColor;
	}

	public Color getMyColor() {
		return myColor;
	}

	public void draw(Graphics g) {
		g.setColor(myColor);
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
	
}
