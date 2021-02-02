package p20200929배치관리자;

import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class A {
	A() {
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridLayout g = new GridLayout(5, 4);
		f.setLayout(g);
		/*
		 * f.add(new JLabel("")); f.add(new JLabel("title")); f.add(new
		 * JLabel("price")); f.add(new JLabel("publisher"));
		 * 
		 * f.add(new JLabel("empty")); // 4 f.add(new JLabel("ㅁㅁ")); f.add(new
		 * JLabel("title")); f.add(new JLabel("price"));
		 * 
		 * f.add(new JLabel("publisher")); // 8 f.add(new JLabel("empty")); f.add(new
		 * JLabel("")); f.add(new JLabel("title"));
		 * 
		 * f.add(new JLabel("price")); // 12 f.add(new JLabel("publisher")); f.add(new
		 * JLabel("empty")); f.add(new JLabel(""));
		 * 
		 * f.add(new JLabel("title")); // 16 f.add(new JLabel("price")); f.add(new
		 * JLabel("publisher")); f.add(new JLabel("empty"));
		 */
		JLabel[] jl = new JLabel[20];

		for (int i = 0; i < jl.length; i++) {
			jl[i] = new JLabel();

			if (i % 4 == 0) {
				jl[i].setText("book_id");
			} else if (i % 4 == 1) {
				jl[i].setText("title");
			} else if (i % 4 == 2) {
				jl[i].setText("price");
			} else {
				jl[i].setText("publisher");
			}
			jl[0] = new JLabel("");
			jl[1] = new JLabel("제목");
			jl[2] = new JLabel("가격");
			jl[3] = new JLabel("출판사");
			f.add(jl[i]);
		}

		f.setSize(250, 250);
		f.setVisible(true);
	}

	public static void main(String[] args) {
		A a = new A();
	}
}
