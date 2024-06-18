package Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class prac5 {
	
	private static String driverPath = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
	private static String user;
	private static String password;
	
	static {
		try {
			Class.forName(driverPath);
			System.out.println("드라이버를 로드 성공함...");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버를 못 찾음...");
		}
	}

	public prac5(String user, String password) {
		this.user = user;
		this.password = password;
	}
	
	public Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url, user, password);
	}
	
	
	
}
