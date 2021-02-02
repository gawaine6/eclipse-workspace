package 이미지연습;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Myframe extends JFrame {
	// 이미지 쓰려면 BufferedImage
	BufferedImage img;
	
	// Wdb의 Myframe 생성자
	public Myframe() {
		setSize(500, 800);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		try {
			img = ImageIO.read(new File("/Users/k/Desktop/Image/1.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		// img를 담을 패널 생성
		Mypanel mp = new Mypanel(img);
		add(mp);
		setVisible(true);
	}
}
