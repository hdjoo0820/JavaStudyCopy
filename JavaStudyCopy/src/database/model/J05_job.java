package database.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.DBConnector;

public class J05_job {

	public J05_job() throws SQLException {

		DBConnector connector = new DBConnector("hr", "1234");
		List<Employee> employees = new ArrayList<>();
		
		try (
			Connection conn = connector.getConnection();				
		) {
			
			String sql = "SELECT * FROM employees, departments"
					+ "WHERE employees.department_id = departments.department_id;";
				
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql); 
				ResultSet rs = pstmt.executeQuery();
			) {
				while (rs.next()) {
					Employee emp = new Employee(rs);
					employees.add(emp);
					
				}

			}

		}

	}

}