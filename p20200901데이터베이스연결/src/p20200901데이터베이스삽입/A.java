package p20200901데이터베이스삽입;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class A {
	public static void main(String args[]) {
		// 드라이버 적재
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 적재 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을수 없습니다.");
		}

		// 변수지정
		String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id = "s1701099";
		String pw = "p1701099";
		Connection conn = null;
		// ResultSet rs = null;
		
		try {
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("연결 성공");
		} catch (SQLException e) {
			System.out.println("드라이버 연결 실패");
		}

		// SQL 문장 작성
		System.out.println("sql문장 작성");
		try {
			Statement stmt = conn.createStatement();
			String sql = "insert into hooks values(7, 'hi', 2000, 'hello')";
			int n = stmt.executeUpdate(sql);
			System.out.println("문장을 삽입했습니다. " + n);
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println("삽입 실패");
		}
	}
}
