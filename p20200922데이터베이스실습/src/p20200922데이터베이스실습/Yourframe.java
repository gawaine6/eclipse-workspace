package p20200922데이터베이스실습;

import javax.swing.JFrame;

public class Yourframe extends JFrame {
	Yourframe(String a) {
		setSize(320, 480);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(a);
		setVisible(true);
	}
}

class A{
	void add(int a, int b) {
		System.out.println(a + b);
		return;
	}
}

class B {
	int add(int a, int b) {
		return a + b;
	}
}



// 내가 정의한 메소드에 결과값이 보고 시플 때, 그 때 리터늘 집어는거고 아니면 그냥 void 