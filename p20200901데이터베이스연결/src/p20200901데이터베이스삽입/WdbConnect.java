package p20200901데이터베이스삽입;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class WdbConnect {

	public static void main(String[] args) {
		Date today = new Date();
		Connection conn = null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Fail");
		}
		System.out.println(today);

		String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
		String id = "s1901135";
		String password = "p1901135";

		try {
			conn = DriverManager.getConnection(url, id, password);
			System.out.println("Connected");
		} catch (SQLException e) {
			System.out.println("Connected Error");
		}
		System.out.println(today);
	}
}
