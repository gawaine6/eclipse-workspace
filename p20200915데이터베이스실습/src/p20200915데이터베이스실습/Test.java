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
class Depart {
	// 1. Driver
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
	
	public void searchAll() {
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from department order by deptno";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Query Requested");
			while(rs.next()) {
				System.out.println(rs.getInt("deptno") + " | " + rs.getString("deptname") + " | " + rs.getInt("floor"));
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}
}


// 여기까지 DB에 연결하고 어떤 쿼리를 이용할지 정의해준다 이제 아래 클래스도 DB에 연결해줘야한다
public class Test {

	public static void main(String[] args) {
		Connection conn = null;
		Date today = new Date();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver in");
		} catch (ClassNotFoundException e) {
			System.out.println("No Driver");
			e.printStackTrace();
		}
		System.out.println(today);
		
		String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id = "s1901135";
		String pass = "p1901135";
		
		try {
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("Connected");
		} catch (SQLException e1) {
			System.out.println("Error Occurred");
			e1.printStackTrace();
		}
		System.out.println(today);
		
		String name = "";
		
		JFrame f = new JFrame("Bae Soon Chul");
		f.setSize(320, 480);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(new FlowLayout());
		JButton button = new JButton();
		f.add(button);
		button.setText("Bae Soon Chul");
		
		try {
			Statement stmt = conn.createStatement();
			String sql = "Select * from department order by deptno";
			ResultSet rs = stmt.executeQuery(sql); 
			System.out.println("Query Requested");
			while(rs.next()) {
				name = rs.getString("deptname");
				f.add(new JButton(name));
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error Occurred");
			e.printStackTrace();
		}
		f.setVisible(true);
	}

}
