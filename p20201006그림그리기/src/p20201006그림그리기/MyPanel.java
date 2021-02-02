package p20201006그림그리기;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	/*
	protected void paintComponent(Graphics g) {
		static int a = 1;
		super.paintComponent(g);
		
		g.drawString("HELLO Mother FUCKERS" + a++, 10, 10);
		우리 눈에는 보이지 않지만 화면 크기가 달라질 때마다 새롭게 쓰는 방식으로 흘러간다 
		그걸 확인하기 위해 int a = 1 을 만들고 뒤에 넣어서 출력해보면 사이즈가 바뀔 때마다 숫자가 변하는걸 알 수 있다
		
		g.drawLine(10, 20, 100, 150);
		
		g.drawRect(10, 30, 100, 100);
		지금까지는 우리가 직접 입력한거고 이번엥 이클립스 딴에서 가져오게 해보자 
		우클릭 -> source -> override/implement methods -> JComponent -> paintComponent 클릭 하면 밑에 대로 나온다
	}
	 */

	@Override
	protected void paintComponent(Graphics g) {
		// g를 붓이라고 생각하자
		super.paintComponent(g);
		g.setColor(Color.BLUE);
		g.drawString("COVID OUT", 20, 10);
		
		g.setColor(Color.PINK);
		// 라인 그리기
		g.drawLine(10, 20, 500, 20);
		// 좌표계 (x1, y1)해서 점 하나 , (x2,y2)해서 점 하나

		// 사각형 그리기
		g.drawRect(10, 30, 100, 100);
		
		// 꺾이는 선 그리기, 배열을 만들어서 각 점의 위치를 잡아준다
		int[] x1 = { 130, 180, 230, 280, 330, 380, 430, 480};
		int[] y1 = { 50, 100, 50, 100, 50, 100, 50, 100};
		g.drawPolyline(x1, y1, 8);
		// drawPolyline(x점배열이름, y점배열이름, 원소갯수)
		
		// 칠해진 사각형
		g.fillRect(10, 150, 100, 100);
		
		// 타원 그리기, 좌표 두개와 크기에 맞춰 사각형을 하나 그리고 거기에 인접하는 타원을 그리는 방식, 사각형이 정사각형이면 그냥 원이 나오겠지
		g.drawOval(150, 150, 150, 100);
		
		// 호 그리기, 아래는 이해하기 쉽게 사각형을 하나 추가한거
		// 사각형을 반으로 나눈 다음 시작하는 각도를 45도, 호의 각도를 90도로 설정
		g.drawArc(350, 150, 100, 100, 45, 90);
		g.fillArc(350, 150, 100, 100, 225, 90);
		// 호에 색칠하는 건데 안에 사각형에서 반대편에 접하는 모양의 색칠된 호를 만들었다, 시작 각도만 바꿔주면 돼
		g.drawRect(350, 150, 100, 100); 
		
		// 해 얼굴 그리기
		g.setColor(Color.yellow);
		g.fillOval(520, 30, 150, 100);
		g.setColor(Color.black);
		g.drawArc(550, 60, 30, 30, 180, -180);
		g.drawArc(610, 60, 30, 30, 180, -180);
		g.drawArc(565, 65, 60, 60, -180, 180);
		g.setColor(Color.red);
		g.fillOval(635, 90, 10, 10);
		g.fillOval(545, 90, 10, 10);
		g.setColor(Color.black);
		g.drawString("Bae Soon Chul", 80, 150);
	}
}
