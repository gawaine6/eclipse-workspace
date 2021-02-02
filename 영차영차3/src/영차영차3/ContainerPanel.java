package 영차영차3;

import java.awt.CardLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ContainerPanel extends JFrame {
	static CardLayout c = new CardLayout();
	static JPanel panel, 시작, 게임;
	static LoginPanel 로그인;
	
	public ContainerPanel() {
		setTitle("운빨망겜");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(900, 600);
		// 프레임 안에 패널을 하나 새로 만들고 그 안에 다른 패널을 여러개 넣어서 필요할때마다 보여주십쇼
		panel = new JPanel();
		panel.setLayout(c);
		시작 = new BackPanel();
		로그인 = new LoginPanel();
		게임 = new GamePanel();
		
		panel.add(시작, "시작화면");
		panel.add(로그인, "로그인화면");
		panel.add(게임, "게임화면");
		add(panel);
		
		setResizable(true);
		setVisible(true);
	}
	static void 로그인화면() {
		c.show(panel, "로그인화면");
	}
	static void 시작화면() {
		c.show(panel, "시작화면");
	}
	static void 게임화면() {
		c.show(panel, "게임화면");
	}
}
