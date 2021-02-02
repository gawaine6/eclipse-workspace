package 영차영차3;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;

public class BackPanel extends JPanel {
	BufferedImage img = null;
	public BackPanel() {		
		try {
			img = ImageIO.read(new File("./image/Start.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(null);
		JButton 시작버튼 = new JButton("Start");
		JButton 종료버튼 = new JButton("Exit");

		시작버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContainerPanel.로그인화면();
			}
		});
		
		종료버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		시작버튼.setBounds(400, 220, 100, 50);
		종료버튼.setBounds(400, 280, 100, 50);

		add(시작버튼);
		add(종료버튼);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, 900, 600, null);
	}
}
