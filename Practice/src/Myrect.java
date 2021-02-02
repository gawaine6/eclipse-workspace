import java.awt.Color;
import java.awt.Graphics;

public class Myrect {
	private int[] xPoints;
	private int[] yPoints;
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
		xPoints[2] = 10;
		xPoints[3] = 60;
		
		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 60;
		yPoints[3] = 60;
	}
	
	
	public void draw(Graphics g) {
		g.setColor(myColor);
		g.fillPolygon(xPoints, yPoints, nPoints);
	}
}
