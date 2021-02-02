package 자바연습;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Myframe extends JFrame{
	public Myframe(String name) {
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(name);
		setLayout(new GridLayout(5, 3));
		JTextField[] jf = new JTextField[5];
		JLabel[] lb = new JLabel[5];
		JButton[] btn = new JButton[5];
		for(int i = 0; i < 5; i++) {
			lb[i] = new JLabel("hello");
			jf[i] = new JTextField("Shit");
			btn[i] = new JButton("good");
			add(lb[i]);
			add(jf[i]);
			add(btn[i]);
		}
	
		setVisible(true);
		
	}
}
public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe f = new Myframe("hello");
	}

}
