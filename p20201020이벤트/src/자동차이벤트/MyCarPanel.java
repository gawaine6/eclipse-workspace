package 자동차이벤트;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyCarPanel extends JPanel implements KeyListener {
	// 이미지 처리
	BufferedImage img = null;
	int img_x, img_y;
	
	// 생성자
	public MyCarPanel() {
		try {
			img = ImageIO.read(new File("/Users/k/Desktop/Lecture/2학기/Object/car.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(1);
		}
		this.addKeyListener(this); // 이거 빼면 뒤져라 눌러도 안됨 병신아
		
		this.requestFocus(); // ????
		setFocusable(true);
	}
	
	// 위에서 이미지를 받아왔으니까 이제 그림을 그려야돼
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		
		g.drawImage(img, img_x, img_y, null);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		System.out.println(keyCode);
		if(keyCode == 39) {
			img_x = img_x + 50;
		} else if(keyCode == 37) {
			img_x = img_x - 50;
		} else if(keyCode == 38) {
			img_y = img_y - 50;
		} else if(keyCode == 40){
			img_y = img_y + 50;
		}

		repaint();
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
	}

}
