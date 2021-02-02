package p20201006그림그리기;

import javax.swing.JFrame;

public class MyFrame extends JFrame {
	// 생성자에서 처리를 하자
	// 생성자는 new 연산자와 같이 사용되어 클래스로 부터 객체를 생성할 때 호출되며 객체의 초기화 담당
	public MyFrame(String name) {
		setTitle(name);
		setSize(1000, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 일반적으로 JPanel에 그림을 그린다 근데 바로 그리기엔 좀 복잡다(?)
		// JPanel을 상속받는 MyPanel 클래스를 하나 만들자
		// 이렇게 하면 MyPanel 클래스에 그려진 그림을 가져와서 집어넣게 된다
		//MyPanel myPanel = new MyPanel();
		//add(myPanel);
		MyPanel mypanel = new MyPanel();
		add(mypanel);
		setVisible(true);
	}
}
