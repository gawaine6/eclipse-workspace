package p20200929배치관리자;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridTest extends JFrame {
	public GridTest() {
		// title
		this.setTitle("grid");
		
		// close oper
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// layout
		this.setLayout(new GridLayout(0, 3));
		
		// btn
		this.add(new JButton("btn1"));
		this.add(new JButton("btn2"));
		this.add(new JButton("btn3"));
		this.add(new JButton("B4"));
		this.add(new JButton("Long btn5"));
		
		this.pack();
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		GridTest g = new GridTest();
	}
}
