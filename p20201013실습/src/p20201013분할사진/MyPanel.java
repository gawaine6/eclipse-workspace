package p20201013분할사진;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	BufferedImage img;

	public MyPanel(BufferedImage img) {
		this.img = img;
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);

		if (MyFrame.mode == 0) {
			// 화면 영역과 이미지 영역에 분할된 부분 그려주기

			// 조각의 폭과 넓이 설정
			int pieceWidth = img.getWidth() / MyFrame.pieces; // 클래스가 따로라서 static 으로 선언
			int pieceHeight = img.getHeight() / MyFrame.pieces;

			for (int x = 0; x < MyFrame.pieces; x++) {
				int sx = x * pieceWidth;

				for (int y = 0; y < MyFrame.pieces; y++) {
					int sy = y * pieceHeight;
					int number = MyFrame.pieceNumber[x * MyFrame.pieces + y];
					int dx = (number / MyFrame.pieces) * pieceWidth;
					int dy = (number % MyFrame.pieces) * pieceHeight;
					g.drawImage(img, dx, dy, dx + pieceWidth, dy + pieceHeight, sx, sy, sx + pieceWidth,
							sy + pieceHeight, null);
				}
			}
		} else {
			g.drawImage(img, 0, 0, null); // img를 0,0부터 시작
		}
	}
}
