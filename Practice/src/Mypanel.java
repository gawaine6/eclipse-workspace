import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Mypanel extends JPanel {
	private Myrect[][] myrects;
	static int size = 4;
	static final int 행의수 = 9;
	static final int 열의수 = 9;
	int mx = 행의수/2;
	int my = 열의수/2;

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);

		int[] xPoints = new int[size];
		int[] yPoints = new int[size];
		int nPoints;
		Color myColor, myColor2, myColor3;
		nPoints = 4;
		myColor = Color.red;
		myColor2 = Color.DARK_GRAY;
		myColor3 = Color.magenta;

		xPoints[0] = 10;
		xPoints[1] = 60;
		xPoints[2] = 60;
		xPoints[3] = 10;

		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 60;
		yPoints[3] = 60;

		// 1개만 그리기
//		for(int i = 0; i < 4; i++) {
//			Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor);
//			myrect.draw(g);
//		}

		// 5개 그리기, y좌표는 10, 60으로 고정되어 있어서 x만 움직인다 이마리야
//		myrects = new Myrect[1][5]; // 1행에 5열을 표시한다
//		for(int i = 0; i < 5; i++) {
//			Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor); // 사각형 객체 만들고
//			myrects[0][i] = myrect; // 만들어진 객체를 배열 순서대로 집어넣어준다
//			myrect.draw(g);
//			for(int j = 0; j < 4; j++) {
//				xPoints[j] = xPoints[j] + 55;
//			}
//		}
		
		// 8행 8열 가득 채우기
		myrects = new Myrect[행의수][열의수];
		for (int i = 0; i < 행의수; i++) {
			xPoints[0] = 10;
			xPoints[1] = 60;
			xPoints[2] = 60;
			xPoints[3] = 10;
			for (int j = 0; j < 열의수; j++) {
				// 테두리에 색깔을 줘보자
				// 테두리에 색을 다르게 줄 myrect 객체를 새로 만들고 if문을 쓰자
				// 색깔을 다르게 주고 싶다면 색깔이 다른 사각형 객체를 만들어주면 된다
				if(i == 0 || j == 0 || i == 행의수-1 || j == 열의수-1) {
					Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor2);
					myrects[i][j] = myrect;
					myrect.draw(g);
				} else if(i == mx && j == my){
					Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor3);
					myrects[i][j] = myrect;
					myrect.draw(g);
				} else {
					Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor);
					myrects[i][j] = myrect;
					myrect.draw(g);
				}
				for (int k = 0; k < 4; k++) {
					xPoints[k] = xPoints[k] + 55;
				}
			}
			for (int k = 0; k < 4; k++) {
				yPoints[k] = yPoints[k] + 55;
			}
		}

	}

	Mypanel() {
		init();
	}

	private void init() {

	}
}
