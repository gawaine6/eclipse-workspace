package p20200929배치관리자;

import java.awt.GridLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
/*
class Connect {
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
			while (rs.next()) {
				System.out.println(rs.getString("book_id") + " | " + rs.getString("title") + " | "
						+ rs.getString("price") + " | " + rs.getString("publisher"));
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}
}*/

public class Work2 {

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
		String pass = "p1901135";

		try {
			conn = DriverManager.getConnection(url, id, pass);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			e.printStackTrace();
		}
		System.out.println(today);

		try {
			Statement stmt = conn.createStatement();
			String sql = "select book_id, title, price, publisher from books order by book_id";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Query Requested");
			System.out.println();
			while (rs.next()) {
				System.out.println(rs.getString("book_id") + " | " + rs.getString("title") + " | "
						+ rs.getString("price") + " | " + rs.getString("publisher"));
			}
		} catch (SQLException e) {
			System.out.println("Query Failed");
			e.printStackTrace();
		}

		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setTitle("Books");

		JLabel jl1 = new JLabel("");
		JLabel jl2 = new JLabel("제목");
		JLabel jl3 = new JLabel("가격");
		JLabel jl4 = new JLabel("출판사");
		f.add(jl1);
		f.add(jl2);
		f.add(jl3);
		f.add(jl4);

		GridLayout gl = new GridLayout(6, 2);
		f.setLayout(gl);

		try {
			Statement stmt = conn.createStatement();
			String sql = "Select * from books order by book_id";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Query Requested");

			while (rs.next()) {
				// 튜플 갯수만큼 4번 돈다
				String bid = rs.getString("book_id"); // book_id 4번
				String title = rs.getString("title"); // title 4번
				String price = rs.getString("price"); // price 4번
				String publisher = rs.getString("publisher"); // publisher 4번

				f.add(new JLabel(bid)); // JFrame에 book_id 를 받은 bid 추가
				f.add(new JLabel(title)); // JFrame에 title 을 받은 title 추가
				f.add(new JLabel(price)); // JFrame에 price 를 받은 price 추가
				f.add(new JLabel(publisher)); // JFrame에 publisher 를 받은 publisher 추가
			}
			stmt.close();
		} catch (SQLException e) {
			System.out.println("Error Occurred");
			e.printStackTrace();
		}

		f.setVisible(true);
	}

}

/*
 * for (int i = 0; i < 12; i++) { jl[i] = new JLabel();
 * jl[i].setText(rs.getString("book_id")); if (i % 4 == 1) {
 * jl[i].setText(rs.getString("title")); } if (i % 4 == 2) {
 * jl[i].setText(rs.getString("price")); } if (i % 4 == 3) {
 * jl[i].setText(rs.getString("publisher")); }
 * 
 * JLabel[] jl = new JLabel[16]; jl[0] = new JLabel(""); jl[1] = new
 * JLabel("제목"); jl[2] = new JLabel("가격"); jl[3] = new JLabel("출판사");
 */
