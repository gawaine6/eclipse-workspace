package 영차영차3;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.TabStop;

public class GamePanel extends JPanel {
	BufferedImage img = null;
	LoginPanel L = ContainerPanel.로그인;
	Connection conn;
	ImageIcon 주사위1, 주사위2, 주사위3, 주사위4, 주사위5, 주사위6, 벨, 플레이어, 컴퓨터;
	JLabel 내주사위, 컴주사위, 목표, 내캐릭, 니캐릭, 결과;
	JButton 굴리기버튼 = new JButton("Roll");
	JButton 다시버튼 = new JButton("Regame");
	JButton 그만버튼 = new JButton("Stop");
	Font font = new Font("Helvetica", Font.BOLD, 20);

	int uX = 40;
	int uY = 525;
	int eX = 820;
	int eY = 525;
	static int count = 0;

	public GamePanel() {
		try {
			img = ImageIO.read(new File("./image/계단.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(null);
		주사위1 = new ImageIcon("./image/1.png");
		주사위2 = new ImageIcon("./image/2.png");
		주사위3 = new ImageIcon("./image/3.png");
		주사위4 = new ImageIcon("./image/4.png");
		주사위5 = new ImageIcon("./image/5.png");
		주사위6 = new ImageIcon("./image/6.png");
		벨 = new ImageIcon("./image/벨.png");
		플레이어 = new ImageIcon("./image/myChar.png");
		컴퓨터 = new ImageIcon("./image/comChar.png");

		내주사위 = new JLabel("", 주사위1, JLabel.LEFT);
		컴주사위 = new JLabel("", 주사위1, JLabel.RIGHT);
		목표 = new JLabel("", 벨, JLabel.CENTER);
		내캐릭 = new JLabel("", 플레이어, JLabel.LEFT);
		니캐릭 = new JLabel("", 컴퓨터, JLabel.RIGHT);
		결과 = new JLabel();
		결과.setFont(font);

		내주사위.setBounds(10, 10, 100, 100);
		컴주사위.setBounds(790, 10, 100, 100);
		목표.setBounds(405, 100, 100, 100);
		내캐릭.setBounds(40, 525, 50, 50);
		니캐릭.setBounds(820, 525, 50, 50);
		결과.setBounds(430, 30, 100, 100);

		add(내주사위);
		add(컴주사위);
		add(목표);
		add(내캐릭);
		add(니캐릭);
		add(결과);

		굴리기버튼.addMouseListener(new MouseListener() {
			@Override
			public void mouseReleased(MouseEvent e) {
			}

			@Override
			public void mousePressed(MouseEvent e) {
				주사위굴리기();
			}

			@Override
			public void mouseExited(MouseEvent e) {
			}

			@Override
			public void mouseEntered(MouseEvent e) {
			}

			@Override
			public void mouseClicked(MouseEvent e) {
			}
		});
		굴리기버튼.setBounds(405, 10, 100, 50);
		add(굴리기버튼);
		
		다시버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ContainerPanel.로그인화면();
			}
		});
		
		그만버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 55, 175, 800, 400, null);
	}

	private void 주사위굴리기() {
		count++;
		int diceUser = (int) (Math.random() * 6 + 1);
		int diceCom = (int) (Math.random() * 6 + 1);
		switch (diceUser) {
		case 1:
			내주사위.setIcon(주사위1);
			break;
		// 내장된 메소드를 써라 지랄하지말고 set get을 제발 좀 해보세요 쉽새기야
		case 2:
			내주사위.setIcon(주사위2);
			break;
		case 3:
			내주사위.setIcon(주사위3);
			break;
		case 4:
			내주사위.setIcon(주사위4);
			break;
		case 5:
			내주사위.setIcon(주사위5);
			break;
		case 6:
			내주사위.setIcon(주사위6);
			break;
		}
		switch (diceCom) {
		case 1:
			컴주사위.setIcon(주사위1);
			break;
		// 내장된 메소드를 써라 지랄하지말고 set get을 제발 좀 해보세요 쉽새기야
		case 2:
			컴주사위.setIcon(주사위2);
			break;
		case 3:
			컴주사위.setIcon(주사위3);
			break;
		case 4:
			컴주사위.setIcon(주사위4);
			break;
		case 5:
			컴주사위.setIcon(주사위5);
			break;
		case 6:
			컴주사위.setIcon(주사위6);
			break;
		}
		repaint();
		if (diceUser > diceCom) {
			// 내가 이기면 올라가고 컴퓨터는 내려간다
			uX = uX + 40;
			uY = uY - 40;
			if (eX == 820 && eY == 525) {
				니캐릭.setBounds(820, 525, 50, 50);
			} else {
				eX = eX + 40;
				eY = eY + 40;
				니캐릭.setBounds(eX, eY, 50, 50);
			}
			내캐릭.setBounds(uX, uY, 50, 50);
		}
		if (diceUser < diceCom) {
			// 내가 지면 내려가고 컴퓨터는 올라간다
			eX = eX - 40;
			eY = eY - 40;
			if (uX == 40 && uY == 525) {
				내캐릭.setBounds(40, 525, 50, 50);
			} else {
				uX = uX - 40;
				uY = uY + 40;
				내캐릭.setBounds(uX, uY, 50, 50);
			}
			니캐릭.setBounds(eX, eY, 50, 50);
		}
		if (uX == 400) {
			결과.setText("Win");
			System.out.println(count);
			L.insert(this);
			굴리기버튼.setVisible(false);
			다시버튼.setBounds(350, 10, 100, 50);
			그만버튼.setBounds(450, 10, 100, 50);
			add(다시버튼);
			add(그만버튼);
		}
		if (eX == 460) {
			결과.setText("Lose");
			System.out.println(count);
			L.insert(this);
			굴리기버튼.setVisible(false);
			다시버튼.setBounds(350, 10, 100, 50);
			그만버튼.setBounds(450, 10, 100, 50);
			add(다시버튼);
			add(그만버튼);
		}
	}

}
