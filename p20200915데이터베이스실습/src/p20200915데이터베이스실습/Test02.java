package p20200915데이터베이스실습;

import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

class Part {
	Connection conn = null;
	Date today = new Date();

	void connect() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Failed");
			e.printStackTrace();
		}
		System.out.println(today);

		String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id = "s1901135";
		String passwd = "p1901135";
		try {
			conn = DriverManager.getConnection(url, id, passwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		System.out.println(today);
	}

	public void searchAll() {
		try {
			Statement stmt = conn.createStatement();
			String sql = "Select * from department order by deptno";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("deptno") + " | " + rs.getString("deptname") + " | " + rs.getInt("floor"));
			}
		} catch (SQLException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
	}
}

public class Test02 {
	public static void main(String[] args) {
		Connection conn = null;
		Date today = new Date();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Driver Failed");
			e.printStackTrace();
		}
		System.out.println(today);

		String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id = "s1901135";
		String passwd = "p1901135";
		try {
			conn = DriverManager.getConnection(url, id, passwd);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		System.out.println(today);

		String name = "";
		JFrame f = new JFrame("Bae Soon Chul");
		f.setSize(300, 200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		f.setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		f.add(button);
		button.setText("Bae Soon Chul");
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from department order by deptno";
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				name = rs.getString("deptname");
				f.add(new JButton(name)); // JFrame에 name 버튼을 넣는다
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error Occured");
			e.printStackTrace();
		}
		f.setVisible(true);
	}

}
