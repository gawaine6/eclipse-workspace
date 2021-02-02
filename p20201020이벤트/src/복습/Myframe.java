package 복습;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Myframe extends JFrame {
	public Myframe(String name) {
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle(name);
		// Layout(Flow)
		this.setLayout(new FlowLayout());
		
		// Button
		JButton btn = new JButton("Click");
		
		// Button eventListener
		btn.addActionListener(new MyListener());
		
		// Add Button to Frame
		this.add(btn);
		this.setVisible(true);
	}
}
