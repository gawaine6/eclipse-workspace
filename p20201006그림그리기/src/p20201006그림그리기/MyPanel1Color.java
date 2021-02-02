package p20201006그림그리기;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class MyPanel1Color extends JPanel implements ActionListener {
	JButton button;
	Color color = new Color(0,0,0);
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼을 눌렀을 때 실행되는 메소드
		// Color를 변경하고, 다시 패널을 그리도록 요청한다
		// 그러면 paintComponent를 호출하면 되는데 혼자 호출을 못한다
		int[] c = new int[3];
		for(int i = 0; i < 3; i++) {
			c[i] = (int)(Math.random() * 255.0); 
			// 랜덤으로 나온 숫자에 255를 곱하고 그걸 int로 강제 형변환
		}
		color = new Color(c[0], c[1], c[2]); // 컬러를 위 배열큼 새로 선언
		repaint(); // 다시 패널을 그리도록 요청
	}
	// 생성자
	public MyPanel1Color() {
		// Layout
		setLayout(new BorderLayout());
		
		// button create
		button = new JButton("배순철");
		button.addActionListener(this);
		add(button, BorderLayout.SOUTH); // button을 borderlayout 안에서 아래쪽에 둔다
	}

	// 그리기
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(color);
		g.drawOval(100, 10, 100, 100); // 얼굴
		g.drawOval(120, 40, 20, 20); // 왼쪽 눈
		g.drawOval(160, 40, 20, 20); // 오른쪽 눈
		g.drawOval(120, 60, 60, 30); // 코
		g.drawOval(130, 70, 10, 10); // 왼쪽 콧구멍
		g.drawOval(160, 70, 10, 10); // 오른쪽 콧구멍
		
		g.drawLine(150, 110, 150, 250); // 몸 
		g.drawLine(150, 110, 80, 170); // 왼팔
		g.drawOval(63, 165, 20, 20); // 왼손
		
		g.drawLine(150, 110, 220, 170); // 오른팔
		g.drawOval(218, 165, 20, 20); // 오른손
		
		g.drawLine(150, 250, 80, 310); // 왼쪽다리
		g.fillRect(60, 310, 20, 20); // 왼발
		
		g.drawLine(150, 250, 220, 310); // 오른다리
		g.fillRect(220, 310, 20, 20); // 오른발
		
	}
	
}
