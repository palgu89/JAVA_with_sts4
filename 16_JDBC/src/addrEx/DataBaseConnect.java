package addrEx;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseConnect {
	// 싱글톤 방식
	// 보통 객체를 생성할 때마다 new로 부여해줬는데
	// 자주 사용되는 애들을 static으로 생성해놓고
	// 사용할 때 마다 주소값만 불러와서 사용
	
	private static DataBaseConnect dbc = new DataBaseConnect();
	// Connection: 데이터베이스와 연결하는 객체
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";	// Referenced Libraries에 있는 경로	// Oracle > oracle.jdbc.driver.OracleDriver
	private String jdbcUrl = "jdbc:mysql://localhost/javatest";	// localhost 대신 127.0.0.1 써도 됨	// Oracle > jdbc:oracle:thin:@localhost:1521:orcl	orcl 또는 ex가 들어감
	
	private DataBaseConnect() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "root", "mysql");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("드라이버를 찾을 수 없습니다");	// 라이브러리 연결 실패
			e.printStackTrace();
		}
		
//		try {
//			Class.forName(jdbcDriver);
//			conn = DriverManager.getConnection(jdbcUrl, "root", "mysql");
//		} catch (ClassNotFoundException e) {
//			System.out.println("드라이버를 찾을 수 없습니다");	// 라이브러리 연결 실패
//			e.printStackTrace();
//		} catch (SQLException e) {
//			System.out.println("연결 정보가 정확하지 않습니다");
//			e.printStackTrace();
//		}
	}
	
	// 다 private이기 때문에 외부에서 사용할 수 있게 해주는 용도
	// 싱글톤으로 만든 후 static으로 사용할 수 있게 하는 캡슐화를 진행 한 것임
	public static DataBaseConnect getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}
	
}
