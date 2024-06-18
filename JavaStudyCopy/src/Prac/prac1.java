package Prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import database.DBConnector;

public class prac1 {
	public static void main(String[] args) {
		DBConnector connector = new DBConnector("hr", "1234");
		
		try(
			Connection conn = connector.getConnection();	
		){
			String sql = "";
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
