package 과제;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JTextField;

public class MyActionListener implements ActionListener {
	Myframe myframe; // Myframe 이라는 객체를 가지고 오는데 이름이 myframe이다, 내 마음대로 줘도 상관이 없다
	PreparedStatement stmt;
	Connection conn;
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

	public MyActionListener(Myframe myframe) { // Myframe.java를 가져오고 매개변수 명은 아무거나, 내 맘대로
		this.myframe = myframe; // this가 객체 자신, MyActionListener가 되는거고
		connect();
	}

	void select() {
		String sql = "select * from books where book_id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql); // 매우 좋네 https://sas-study.tistory.com/160
			String a = myframe.jtx[0].getText();

			stmt.setString(1, a); // 첫번째 ? 에 a 값을 넣어준다
			System.out.println("Query Requested");

			ResultSet rs = stmt.executeQuery();
			rs.next();
			String bid = rs.getString("book_id");
			String title = rs.getString("title");
			String publisher = rs.getString("publisher");
			String year = rs.getString("year");
			String price = rs.getString("price");

			myframe.jtx[0].setText(bid);
			myframe.jtx[1].setText(title);
			myframe.jtx[2].setText(publisher);
			myframe.jtx[3].setText(year);
			myframe.jtx[4].setText(price);

			a = myframe.jtx[0].getText();
			String b = myframe.jtx[1].getText();
			String c = myframe.jtx[2].getText();
			String d = myframe.jtx[3].getText();
			String e = myframe.jtx[4].getText();
			System.out.println(a + " | " + b + " | " + c + " | " + d + " | " + e);
		} catch (SQLException e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}

	void insert() {
		String sql = "insert into books values (?, ?, ?, ?, ?)";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			String a = myframe.jtx[0].getText();
			stmt.setString(1, a);
			String b = myframe.jtx[1].getText();
			stmt.setString(2, b);
			String c = myframe.jtx[2].getText();
			stmt.setString(3, c);
			String d = myframe.jtx[3].getText();
			stmt.setString(4, d);
			String e = myframe.jtx[4].getText();
			stmt.setString(5, e);

			int r = stmt.executeUpdate();
			System.out.println(a + " | " + b + " | " + c + " | " + d + " | " + e);
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	void delete() {
		String sql = "delete from books where book_id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			String a = myframe.jtx[0].getText();
			stmt.setString(1, a);
			int r = stmt.executeUpdate(); // insert, delete, update문을 사용할 때는 리턴된 행의 갯수만큼 int 형으로 받아온다
			System.out.println("Delete book_id " + a);
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	void update() {
		String sql = "update books set title = ?, publisher = ?, year = ?, price = ? where book_id = ?";
		try {
			PreparedStatement stmt = conn.prepareStatement(sql);
			String a = myframe.jtx[0].getText();
			String b = myframe.jtx[1].getText();
			String c = myframe.jtx[2].getText();
			String d = myframe.jtx[3].getText();
			String e = myframe.jtx[4].getText();
			stmt.setString(1, b);
			stmt.setString(2, c);
			stmt.setString(3, d);
			stmt.setString(4, e);
			stmt.setString(5, a);

			int r = stmt.executeUpdate();
			System.out.println("update book_id " + a);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton) e.getSource();
		String type = button.getText();
		if (type.equals("select")) {
			// String a = myframe.jtx[0].getText(); 이건 위에 있으니까 굳이 안 써줘도 된다 그래도 써놨으니까 어떤
			// 의미인지는 알고 가자
			System.out.println(type);
			select();
		} else if (type.equals("insert")) {
			System.out.println(type);
			insert();
		} else if (type.equals("delete")) {
			System.out.println(type);
			delete();
		} else {
			System.out.println(type);
			update();
		}
	}

}
// myframe.jtx[1].getText()