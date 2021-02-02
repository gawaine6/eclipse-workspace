package p20200922데이터베이스실습;

import java.awt.ComponentOrientation;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame{
// Myframe이 JFrame 을 상속받았다
	Myframe() {
		setSize(300, 200);
		// JFrame의 메소드를 상속받았기 때문에 앞에 따로 써주지 않아도 바로 사용할 수 있다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("afk");
		// 순차적으로 배치하는 배치관리자 객체 생성
		FlowLayout f = new FlowLayout(FlowLayout.LEADING);
		setLayout(f);
		this.applyComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		//JButton btn1 = new JButton();
		// JButton btn2 = new JButton();
		for(int i = 0; i < 10; i++) {
			this.add(new JButton("button" + i));
		}
		/*
		 * 22 ~ 29 btn2 클릭시 종료
		 * btn2.addActionListener(new ActionListener() {
		 
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		*/
		//btn1.setText("꺼 씨발");
//		/ btn2.setText("눌러 씨발");
		//add(btn1);
		// add(btn2);
		setVisible(true);
	}
}
