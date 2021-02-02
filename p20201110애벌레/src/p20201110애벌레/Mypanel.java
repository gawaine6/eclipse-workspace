package p20201110애벌레;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class Mypanel extends JPanel implements KeyListener {
	private Myrect[][] myRects;
	static int SIZE = 4;
	int mX, mY;
	static final int 행의수 = 20;
	static final int 열의수 = 28;
	Color mBackupColor = Color.cyan;
	int mDirection = KeyEvent.VK_UP;
	boolean isPressed = false; // 사용자가 방향키를 눌렀는지 확인
	int mKeyCode; // 누른 방향키를 저장한다
	
	public void auto() {
//		int mDirection = 0; // 0 아래, 1 위
//		if(mDirection == 0) {
//			if(mX != 행의수-2) {
//				myRects[mX][mY].setMyColor(Color.cyan);
//				mX = mX + 1;
//				myRects[mX][mY].setMyColor(Color.blue);
//			} else {
//				mDirection = 1;
//			}
//		} else {
//			if(mX != 1) {
//				myRects[mX][mY].setMyColor(Color.cyan);
//				mX = mX - 1;
//				myRects[mX][mY].setMyColor(Color.blue);
//			} else {
//				mDirection = 0;
//			}
//		}
		if(mDirection == KeyEvent.VK_UP) {
			if(mX != 행의수-2) {
				myRects[mX][mY].setMyColor(Color.cyan);
				mX = mX + 1;
				myRects[mX][mY].setMyColor(Color.blue);
			} else {
				mDirection = KeyEvent.VK_DOWN;
			}
		} else {
			if(mX != 1) {
				myRects[mX][mY].setMyColor(Color.cyan);
				mX = mX - 1;
				myRects[mX][mY].setMyColor(Color.blue);
			} else {
				mDirection = KeyEvent.VK_UP;
			}
		}
		repaint();
	}
	
	public void autoPlay() {
		if(mX == 행의수-2 || mX == 1 || mY == 1 || mY == 열의수-2) {
			System.out.println("Game over");
			System.exit(0);
		}
		// 사용자가 방향키를 눌렀는지 확인하자
		if(isPressed) {		// 눌렀다면 누른 방향으로 이동
			myRects[mX][mY].setMyColor(mBackupColor);
			switch(mKeyCode) {
			case KeyEvent.VK_UP :    
				if(mX != 1)
					mX = mX -1;  break;
			case KeyEvent.VK_DOWN :  
				if(mX != 행의수-2)
					mX = mX +1;  break;
			case KeyEvent.VK_LEFT:   
				if(mY != 1)
					mY = mY -1;  break;
			case KeyEvent.VK_RIGHT : 
				if(mY != 열의수-2)
					mY = mY +1;  break;
			}
		} else { 		// 안 눌렀다면 지금 방향으로 이동
			myRects[mX][mY].setMyColor(mBackupColor);
			switch(mDirection) {
			case KeyEvent.VK_UP :    
				if(mX != 1)
					mX = mX -1;  break;
			case KeyEvent.VK_DOWN :  
				if(mX != 행의수-2)
					mX = mX +1;  break;
			case KeyEvent.VK_LEFT:   
				if(mY != 1)
					mY = mY -1;  break;
			case KeyEvent.VK_RIGHT : 
				if(mY != 열의수-2)
				mY = mY +1;  break;
			}
		}
		mBackupColor = myRects[mX][mY].getMyColor();
		myRects[mX][mY].setMyColor(Color.BLUE);
		repaint();
	}
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		for (int j = 0; j < 행의수; j++) {
			for (int i = 0; i < 열의수; i++) {
				myRects[j][i].draw(g);
			}
		}
	}
	Mypanel() {
		init();
	}

	// �ʱ�ȭ �۾�
	private void init() {
		// 타이머 사용을 위한 등록
		// 타이머 객체
		Timer timer = new Timer();
		
		MyTimeEvent myTimeEvent = new MyTimeEvent(this);
		// 새로 만든 타이머 객체에 시작시각, 트리거 시간, 트리거 될 때 수행할 이벤트 객체 지정
		timer.schedule(myTimeEvent, 1000, 100); // 1초 뒤에 0.1초 간격으로 myTimeEvent 실행?
		
		
		// 중앙점
		mX = 행의수 / 2;
		mY = 열의수 / 2;
		
		
//		// myRect ��ü���� �����ϰ�, ��ǥ������ �ʱ�ȭ �Ѵ�.
		int[] xPoints = new int[SIZE];
		int[] yPoints = new int[SIZE];
		int nPoints;
		Color myColor;
		nPoints = 4;
		myColor = Color.RED;

//		xPoints[0] = 10;
//		xPoints[1] = 60;
//		xPoints[2] = 60;
//		xPoints[3] = 10;

		yPoints[0] = 10;
		yPoints[1] = 10;
		yPoints[2] = 35;
		yPoints[3] = 35;

		myRects = new Myrect[행의수][열의수];

		for (int j = 0; j < 행의수; j++) {
			xPoints[0] = 10;
			xPoints[1] = 35;
			xPoints[2] = 35;
			xPoints[3] = 10;

			for (int i = 0; i < 열의수; i++) {
				// �����Ϸ��� �ϴ� ��ü�� �׵θ��� �ִ��� �˻��Ͽ� 
				// �׵θ��� ������ myColor �� �ٸ� ������ ����
				if( j ==0 || j == 행의수-1 || i ==0 || i == 열의수-1) {
					myColor = Color.RED;
				} else {
					myColor = Color.CYAN;
				}
				
				// �߰��� ��ġ�� ���̸� ������ �Ķ������� ����
				if( j == mX && i ==mY ) {
					myColor = Color.BLUE;
				}
				
				
				Myrect myRect = new Myrect(xPoints, yPoints, nPoints, myColor);
				myRects[j][i] = myRect;
				for (int k = 0; k < 4; k++) {
					xPoints[k] = xPoints[k] + 27;
				}
			}
			for (int k = 0; k < 4; k++) {
				yPoints[k] = yPoints[k] + 27;
			}

		}	
		
		addKeyListener(this);
		this.requestFocus();
		setFocusable(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int keycode = e.getKeyCode();
		if(keycode == KeyEvent.VK_UP || 
			keycode == KeyEvent.VK_DOWN || 
			keycode == KeyEvent.VK_LEFT || 
			keycode == KeyEvent.VK_RIGHT) {
			isPressed = true;
			mKeyCode = keycode;
		}
//		myRects[mX][mY].setMyColor(Color.CYAN);
//		myRects[mX][mY].setMyColor(mBackupColor);
//		switch( keycode) {
//		case KeyEvent.VK_UP :    
//			if(mX != 1)
//				mX = mX -1;  break;
//		case KeyEvent.VK_DOWN :  
//			if(mX != 행의수-2)
//				mX = mX +1;  break;
//		case KeyEvent.VK_LEFT:   
//			if(mY != 1)
//				mY = mY -1;  break;
//		case KeyEvent.VK_RIGHT : 
//			if(mY != 열의수-2)
//			mY = mY +1;  break;
//		}
//		mBackupColor = myRects[mX][mY].getMyColor();
//		myRects[mX][mY].setMyColor(Color.BLUE);
//		repaint();
//		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
