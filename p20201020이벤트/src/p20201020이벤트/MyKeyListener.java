package p20201020이벤트;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// 눌러진 키 문자 얻어오기
		char c = e.getKeyChar();
		int keyCode = e.getKeyCode();
		
		// 화면에 출력
		System.out.println("Typed Key : " + c + " KeyCode " + keyCode);

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

}
