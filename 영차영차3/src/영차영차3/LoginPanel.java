package 영차영차3;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginPanel extends JPanel {
	BufferedImage img = null;
	JTextField 아이디입력;
	String 아이디;
	Connection conn = null;
	GamePanel game;
	public LoginPanel() {
		try {
			img = ImageIO.read(new File("./image/Login.jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		setLayout(null);
		JButton 로그인버튼 = new JButton("Login");
		JButton 이전버튼 = new JButton("Pre");
		아이디입력 = new JTextField();
		아이디입력.setBounds(400, 220, 100, 50);
		add(아이디입력);
		로그인버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContainerPanel.게임화면();
			}
		});
		이전버튼.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ContainerPanel.시작화면();
			}
		});
		로그인버튼.setBounds(400, 280, 100, 50);
		이전버튼.setBounds(400, 340, 100, 50);

		add(로그인버튼);
		add(이전버튼);
	}

	@Override
	protected void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, 900, 600, null);
	}

	public void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Fail");
		}
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "pra";
		String password = "pra";

		try {
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Connected Error");
		}
	}
	public void insert(GamePanel game) {
		this.game = game; // 이게 정확히 어떤 의미인지 왜 이렇게 해줘야 널이 안뜨는지
		connect();

		String sql = "insert into JAVA values (usernum.nextval, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			String a = 아이디입력.getText();
			// 이때까지 삽입이 안됐던 이유
			// 1. 컨테이너 패널에서 JPanel 로그인 으로 설정하고, GamePanel에서 LoginPanel L = new LoginPanel()을 했다
			// 2. 이렇게 하면 기존에 있던 LoginPanel과는 전혀 다른 친구가 와서 getText를 해도 값을 못 받아오던 거였다
			// 3. 컨테이너에서 아예 static LoginPanel 로그인으로 변경
			// 4. 게임패널에서 LoginPanel L = ContainerPanel.로그인; 으로 초기화
			stmt.setString(1, a);
			String b = Integer.toString(GamePanel.count);
			stmt.setString(2, b);
			String c = game.결과.getText();
			stmt.setString(3, c);
			stmt.executeUpdate();
			System.out.println("insert complete");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
