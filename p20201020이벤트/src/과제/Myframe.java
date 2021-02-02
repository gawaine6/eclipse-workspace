package 과제;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class Myframe extends JFrame {
	JTextField jtx[];
	Connection conn = null;
	Date today = new Date();
	
	void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Success");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Driver Failed");
			e.printStackTrace();
		}
		System.out.println(today);

		String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id = "s1901135";
		String pass = "p1901135";

		try {
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		System.out.println(today);
	}
	public Myframe(String name) {
		this.setTitle(name);
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(new GridLayout(5, 3));
		JLabel[] labels = new JLabel[5];
		labels[0] = new JLabel("book_id");
		labels[1] = new JLabel("title");
		labels[2] = new JLabel("publisher");
		labels[3] = new JLabel("year");
		labels[4] = new JLabel("price");

		jtx = new JTextField[5];
		for (int i = 0; i < 5; i++) {
			jtx[i] = new JTextField(20);
		}
		JButton[] buttons = new JButton[5];
		buttons[0] = new JButton("select");
		buttons[1] = new JButton("insert");
		buttons[2] = new JButton("update");
		buttons[3] = new JButton("delete");

		MyActionListener listener = new MyActionListener(this); // 여기서 this는 Myframe 이고
		for (int i = 0; i < 5; i++) {
			this.add(labels[i]);
			this.add(jtx[i]);
			if(i < 4) {
				this.add(buttons[i]);
				buttons[i].addActionListener(listener);		
			}
		}
		this.setVisible(true);
	}
}
