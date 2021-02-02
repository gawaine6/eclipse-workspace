package p20201013분할사진;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener{
	BufferedImage img;
	static int pieces = 5;
	int totalPieces = pieces * pieces;
	static int[] pieceNumber;
	static int mode = 0; // mode 0이면 분할, mode 1이면 원래대로
	JButton button, button1;
	// 생성자
	public MyFrame() {
		setTitle("배순철 분할사진");
		try {
			img = ImageIO.read(new File("/Users/k/Desktop/moneycat.png"));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// 조각번호 지정할 배열 생성하고 초기화
		pieceNumber = new int[totalPieces];
		for(int i = 0; i < totalPieces; i++) {
			pieceNumber[i] = i;
		}
		
		// 패널 생성 및 추가
		MyPanel myPanel = new MyPanel(img);
		setLayout(new BorderLayout());
		add(myPanel, BorderLayout.CENTER);
		
		// 버튼 생성 및 추가
		button = new JButton("Divide");
		button1 = new JButton("Rollback");
		JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
		panel1.add(button);
		panel1.add(button1);
		// add(button, BorderLayout.SOUTH);
		add(panel1,BorderLayout.SOUTH);
		
		// 버튼에 리스너 연결
		button.addActionListener(this);
		button1.addActionListener(this);
		setSize(600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	void divide() {
		Random rand = new Random();
		int ri;
		for(int i = 0; i < totalPieces; i++) {
			ri = rand.nextInt(totalPieces);
			int tmp = pieceNumber[i];
			pieceNumber[i] = pieceNumber[ri];
			pieceNumber[ri] = tmp;
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			mode = 0;
		} else {
			mode = 1;
		}
		divide();
		repaint();
	}
	
}
