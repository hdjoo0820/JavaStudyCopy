package Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class prac3 {
	public static void main(String[] args) {
		String driverPath = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
		String user = "prac";
		String password = "1234";
		try {
			Class.forName(driverPath);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();
		String text2 = sc.nextLine();
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
		){
			String sql = "INSERT INTO soccer VALUES(soccer_seq.nextval, ?, ?)";
			
			try(
				PreparedStatement pstmt = conn.prepareStatement(sql);	
				
			){
				
				pstmt.setString(1, text);
				pstmt.setString(2, text2);
				pstmt.executeUpdate();
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
