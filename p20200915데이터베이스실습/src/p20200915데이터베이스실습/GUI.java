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

class DepartmentManager {
	   Connection conn = null;
	   Date today = new Date();
	   void connect() {
	      // 1. JDBC 드라이버를 적재
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         System.out.println("Driver Success");
	      } catch (ClassNotFoundException e) {
	         System.out.println("Driver Failed");
	      }
	      System.out.println(today);

	      // 2. 데이터베이스 연결

	      String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
	      String id = "s1901135";
	      String password = "p1901135";

	      try {
	         conn = DriverManager.getConnection(url, id, password);
	         System.out.println("Connected");
	      } catch (SQLException e) {
	         System.out.println("Connection Failed");
	      }
	      System.out.println(today);
	   }

	   // Department 테이블의 모두 행을 조회하는 메소드
	   public void searchAll() {
	      // 3. SQL문장 작성 및 전송
	      try {
	         Statement stmt = conn.createStatement();
	         String sql = "select * from DEPARTMENT order by DEPTNO";
	         ResultSet rs = stmt.executeQuery(sql);
	         System.out.println("Query Requested");
	         // 4. 결과집합 사용 후 연결 해제
	         // 결과 집합의 첫번째 레코드로 커서를 이동시킨다.
	         while (rs.next()) {
	            System.out.println(rs.getInt("DEPTNO") + " : " + rs.getString("DEPTNAME") + " : " + rs.getInt("FLOOR"));
	         }
	         stmt.close();
	      } catch (SQLException e) {
	         System.out.println("Exception Occured");
	      }

	   }
	}

	public class GUI {

	   public static void main(String[] args) {
	      Connection conn = null;
	      Date today = new Date();
	      // 1. 드라이버 로딩
	      // 1. JDBC 드라이버를 적재
	      try {
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         System.out.println("Driver in");
	      } catch (ClassNotFoundException e) {
	         System.out.println("No Driver");
	      }
	      System.out.println(today);

	      // 2. 데이터베이스 연결

	      String url = "jdbc:oracle:thin:@net.yju.ac.kr:1521:orcl";
	      String id = "s1901135";
	      String password = "p1901135";

	      try {
	         conn = DriverManager.getConnection(url, id, password);
	         System.out.println("Connected");
	      } catch (SQLException e) {
	         System.out.println("Connection Failed");
	      }
	      // 3. 쿼리 작성 및 전송
	      String name = "";

	      JFrame f = new JFrame("Bae Soon Chul");
	      f.setSize(300, 200);
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      f.setLayout(new FlowLayout());
	      JButton button1 = new JButton("버튼");
	      f.add(button1);
	      button1.setText("Bae Soon Chul");

	      try {
	         Statement stmt = conn.createStatement();
	         String sql = "select * from DEPARTMENT order by DEPTNO";
	         ResultSet rs = stmt.executeQuery(sql);
	         System.out.println("쿼리를 요청하였습니다.");
	         // 4. 결과 ResultSet을 이용하여 부서이름 저장(추가 변수 사용)
	         // 결과 집합의 첫번째 레코드로 커서를 이동시킨다.
	         while(rs.next()) {
	        	 name = rs.getString("DEPTNAME");
	        	 f.add(new JButton(name));
	         }
	         stmt.close();

	      } catch (SQLException e) {
	         System.out.println("Exception Occured");
	         e.printStackTrace();
	      }
	      f.setVisible(true);
	   }

	}