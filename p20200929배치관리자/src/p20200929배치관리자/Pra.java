package p20200929배치관리자;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Pra extends JFrame {
	public Pra() {
		this.setTitle("Pra");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		GridLayout gl = new GridLayout(4, 4);
		this.setLayout(gl);
		
		JButton[] btn = new JButton[16];
		for(int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			this.add(btn[i]);
		}
		btn[2].setText("책 정보");
		btn[4].setText("1");
		btn[5].setText("책이름1");
		btn[6].setText("10,000");
		btn[7].setText("영진출판");
		btn[8].setText("2");
		btn[9].setText("책이름2");
		btn[10].setText("10,000");
		btn[11].setText("영진출판");
		btn[12].setText("3");
		btn[13].setText("책이름3");
		btn[14].setText("10,000");
		btn[15].setText("영진출판");
		
		this.setSize(300, 400);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Pra p = new Pra();
	}
}

