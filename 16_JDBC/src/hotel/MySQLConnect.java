package hotel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnect {
	private static MySQLConnect msc = new MySQLConnect();
	private Connection conn = null;
	private String jdbcDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbcUrl = "jdbc:mysql://localhost/javatest";
	
	public MySQLConnect() {
		try {
			Class.forName(jdbcDriver);
			conn = DriverManager.getConnection(jdbcUrl, "root", "");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("드라이버를 찾을 수 없습니다");
			e.printStackTrace();
		}
	}
	
	public static MySQLConnect getInstance() {
		return msc;
	}
	public Connection getConnection() {
		return conn;
	}
}
