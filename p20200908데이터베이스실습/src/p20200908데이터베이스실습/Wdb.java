package p20200908데이터베이스실습;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

class DepartmentManager {
	Date today = new Date();
	Connection conn = null;

	void connect() {
		// 1. JDBC 드라이버를 적재
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Success");
		} catch (ClassNotFoundException e) {
			System.out.println("Fail");
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
			System.out.println("Connected Error");
		}
		System.out.println(today);
	}

	// Sql문을 입력받아 DB에 처리하는 메소드
	void insert(String sql) {
		try {
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			System.out.println(n + "개의 행이 삽입");
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// Department 테이블의 모두 행을 조회하는 메소드
	public void searchAll() {
		// 3. SQL문장 작성 및 전송
		try {
			Statement stmt = conn.createStatement();
			String sql = "select * from department order by deptno";
			ResultSet rs = stmt.executeQuery(sql);
			// 4. 결과집합 사용 후 연결 해제
			// 결과 집합의 첫번째 레코드로 커서를 이동시킨다.
			while (rs.next()) {
				System.out.println(rs.getInt("deptno") + " | " + rs.getString("deptname") + " | " + rs.getInt("floor"));
			}
			stmt.close();

		} catch (SQLException e) {
			System.out.println("Exception Occured");
		}

	}

	// 부서번호 no 를 주면 해당 레코드를 삭제
	public void delete(int no) {
		try {
			String sql = "delete department where deptno =" + no;
			Statement stmt = conn.createStatement();
			int n = stmt.executeUpdate(sql);
			System.out.println(n + "개의 행이 삭제되었습니다.");
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 부서이름의 일부로 검색 ( "총" 이라고 입력하면 총무 부서 레코드 출력 )
	public void search(String bName) {
		try {
			String sql = "select * from department where deptname like '%" + bName + "%'";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(rs.getInt("deptno") + " | " + rs.getString("deptname") + " | " + rs.getInt("floor"));
			}
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Error");
		}
	}

	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class Wdb {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DepartmentManager manager = new DepartmentManager();
		manager.connect();
		while (true) {

			System.out.println("Choose Task \n1: Insert, 2: Select Name, 3: Delete, 4: Search All, 9: Exit");
			int data = scan.nextInt();
			switch (data) {
			case 1: // 삽입
				System.out.print("부서번호 입력 : ");
				int no = scan.nextInt();
				System.out.print("부서명 입력 : ");
				String name = scan.next();
				System.out.print("층 입력 : ");
				int floor = scan.nextInt();
				// 입력받은 데이터를 이용하여 SQL문 생성한다.
				// insert into DEPARTMENT(DEPTNO, DEPTNAME, FLOOR) values( 1,
				// '영업',
				// 3)
				String sql = "insert into department(deptno, deptname, floor) values( ";
				sql = sql + no + ", '" + name + "', " + floor + ")";
				System.out.println(sql);
				// 작업.
				manager.insert(sql);
				break;
			case 4:
				manager.searchAll();
				break;

			case 3: // 부서번호를 주면 해당 레코드를 삭제
				no = scan.nextInt();
				manager.delete(no);
				break;
			case 2: // 부서이름의 일부로 검색 ( "총" 이라고 입력하면 총무 부서 레코드 출력 )
				String bName = scan.next();
				manager.search(bName);
				break;
			}

			if (data == 9) {
				manager.close();
				break;
			}

		}

	}

}