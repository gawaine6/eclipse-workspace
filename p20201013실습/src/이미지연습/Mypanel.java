package 이미지연습;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Mypanel extends JPanel {
	// 이미지 사용
	BufferedImage img;
	
	public Mypanel(BufferedImage img) {
		this.img = img;
	}

	@Override
	// Dimension : 폭과 높이를 캡슐화 해주는 클래스, 쉽게 말해서 가로 세로 길이 값을 저장하는 클래스
	public Dimension getPreferredSize() {
		if(this.img == null) {
			return new Dimension(100, 100);
		} else {
			return new Dimension(img.getWidth(null), img.getHeight(null));
		}
	}

	// 위치 잡아줬으니까 이제 그려야지
	@Override
	public void paint(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}
	
	
	
}
