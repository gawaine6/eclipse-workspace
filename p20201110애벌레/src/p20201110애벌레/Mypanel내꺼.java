package p20201110애벌레;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Mypanel내꺼 extends JPanel implements KeyListener {
	private Myrect[][] myrects;
	static int SIZE = 4;
	int mX, mY;
	static final int 행의수 = 20;
	static final int 열의수 = 28;

	@Override
	protected void paintComponent(Graphics g) {

		super.paintComponent(g);

//		
//		// 1행을 그리자, 다시 x는 처음부터 시작해야되니까 x위치를 다시 잡아주자
//		xPoints[0] = 10;
//		xPoints[1] = 60;
//		xPoints[2] = 60;
//		xPoints[3] = 10;
//		
//		// 1행을 그리는데 아래쪽에 그려야되니까 증가한 수치만큼 추가해서 새로 초기화 해주자
//		yPoints[0] = 65;
//		yPoints[1] = 65;
//		yPoints[2] = 115;
//		yPoints[3] = 115;
//		
//		for(int i = 0; i < 8; i++) {
//			Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor);
//			myrects[1][i] = myrect;
//			for(int k = 0; k < 4; k++) {
//				xPoints[k] = xPoints[k] + 55;
//			}
//		}

		// 1행, 2행을 그려야되니까 2바퀴 돌고, 안에 있는건 내가 그릴 사각형 횟수만큼 반복한다
		for (int j = 0; j < 행의수; j++) {
			for (int i = 0; i < 열의수; i++) {
				myrects[j][i].draw(g);
			}
		}

	}

	Mypanel내꺼() {
		init();
	}

	// 초기화 작업
	private void init() {
		// 중앙점
		mX = 행의수 / 2;
		mY = 열의수 / 2;

		int[] xPoints = new int[SIZE];
		int[] yPoints = new int[SIZE];
		int nPoints;
		Color myColor;
		nPoints = 4;
		myColor = Color.red;

//		xPoints[0] = 10;
//		xPoints[1] = 35;
//		xPoints[2] = 35;
//		xPoints[3] = 10;

		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 35;
		yPoints[3] = 35;

		myrects = new Myrect[행의수][열의수]; // 8줄에 사각형 8개씩
		for (int j = 0; j < 행의수; j++) {
			xPoints[0] = 10;
			xPoints[1] = 35;
			xPoints[2] = 35;
			xPoints[3] = 10;

			for (int i = 0; i < 열의수; i++) {
				// 객체에 테두리가 있는지 검사
				// 테두리가 있으면 myColor를 다른 색으로 지정한다
				// 먼저 다른 색을 하나 만들어놔주고
				// 다른 색을 가진 사각형 객체를 만들어서 그리게 해주자
				if (i == 0 || j == 0 || i == 열의수 - 1 || j == 행의수 - 1) {
//					Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor2);
//					myrects[j][i] = myrect;
					myColor = Color.red;
				} else {
//					Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor);
//					myrects[j][i] = myrect;
					myColor = Color.cyan;
				}
				if(j == mX && i == mY) {
					myColor = Color.BLUE;
				}
				
				Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor);
				myrects[j][i] = myrect;
				for (int k = 0; k < 4; k++) {
					xPoints[k] = xPoints[k] + 27;
				}
			}
			for (int k = 0; k < 4; k++) {
				yPoints[k] = yPoints[k] + 27;
			}
//		
//		// 1행을 그리자, 다시 x는 처음부터 시작해야되니까 x위치를 다시 잡아주자
//		xPoints[0] = 10;
//		xPoints[1] = 60;
//		xPoints[2] = 60;
//		xPoints[3] = 10;
//		
//		// 1행을 그리는데 아래쪽에 그려야되니까 증가한 수치만큼 추가해서 새로 초기화 해주자
//		yPoints[0] = 65;
//		yPoints[1] = 65;
//		yPoints[2] = 115;
//		yPoints[3] = 115;
//		
//		for(int i = 0; i < 8; i++) {
//			Myrect myrect = new Myrect(xPoints, yPoints, nPoints, myColor);
//			myrects[1][i] = myrect;
//			for(int k = 0; k < 4; k++) {
//				xPoints[k] = xPoints[k] + 55;
//			}
//		}
			addKeyListener(this);
			this.requestFocus();
			setFocusable(true);
		}
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		myrects[mX][mY].setMyColor(Color.cyan);
		switch(keycode) {
		case KeyEvent.VK_UP : mX = mX - 1; break;
		case KeyEvent.VK_DOWN : mX = mX + 1; break;
		case KeyEvent.VK_LEFT : mY = mY - 1; break;
		case KeyEvent.VK_RIGHT : mY = mY + 1; break;
		}
		myrects[mX][mY].setMyColor(Color.BLUE);
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
