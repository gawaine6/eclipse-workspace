package p20201013이미지;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import p20201013폰트.MyPanel;

public class MyImageFrame extends JFrame {
	BufferedImage img = null;
	
	public MyImageFrame() {
		setTitle("배순철");
		
		try {
			img = ImageIO.read(new File("/Users/k/Desktop/Sandy.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0); // 오류시 프로그램 종료
		}
		
		MyImagePanel mip = new MyImagePanel(img);
		add(mip);
		pack();
		setVisible(true);
	}
}
