package p20200929배치관리자;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {
	public MyFrame() {
		// title
		this.setTitle("sony");

		// defaultcloseoperation
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// layout
		// FlowLayout f = new FlowLayout();
		// this.setLayout(f);
		BorderLayout b = new BorderLayout();
		this.setLayout(b);

		// button
		JButton[] btn = new JButton[6];
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new JButton();
			btn[i].setText("a" + i);
			// this.add(btn[i]);
		}
		// this.add(btn[0], BorderLayout.CENTER);
		this.add(btn[1], BorderLayout.NORTH);
		this.add(btn[2], BorderLayout.EAST);
		this.add(btn[3], BorderLayout.SOUTH);
		this.add(btn[4], BorderLayout.WEST);

		// 컨테이너 컴포넌트 JPanel을 사용해 다른 버튼 두개 포함
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout()); // 컨테이너는 자기 고유의 레이아웃을 만들어야 한다
		p.add(btn[0]);
		p.add(btn[5]);
		JTextField jtf = new JTextField("WDB Major");
		p.add(jtf);
		JLabel jl = new JLabel("Name : ");
		p.add(jl);
		this.add(p, BorderLayout.CENTER); // 패널에 버튼 두개를 넣고 보더 레이아웃 중앙에 버튼 두개가 들어간걸 넣어준다
		
		// visible
		this.setVisible(true);
		this.setSize(320, 480);

	}
}
