package product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
	
	private static MySQLConnect dbc = new MySQLConnect();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost/javatest";
	
	private MySQLConnect() {
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
	public static MySQLConnect getInstance() {
		return dbc;
	}
	public Connection getConnection() {
		return conn;
	}
	
}
