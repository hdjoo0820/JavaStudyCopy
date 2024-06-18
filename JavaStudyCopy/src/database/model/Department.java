package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Department {
	private Integer department_id;
	private String first_name;
	private String manager_id;
	private String location_id;
	
	public Department(ResultSet rs) throws SQLException {
		department_id = rs.getInt("department_id");
		first_name = rs.getString("first_name");
		manager_id = rs.getString("manager_id");
		location_id = rs.getString("location_id");
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getManager_id() {
		return manager_id;
	}
	public void setManager_id(String manager_id) {
		this.manager_id = manager_id;
	}
	public String getLocation_id() {
		return location_id;
	}
	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}
	@Override
	public String toString() {
		return "Department [department_id=" + department_id + ", first_name=" + first_name + ", manager_id="
				+ manager_id + ", location_id=" + location_id + "]";
	}
	
	
}
