package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Employee {
	private int employee_id;
	private String first_name;
	private String last_name;
	private String email;
	private String phone_number;
	private Date hire_Date;
	private String job_id;
	private Float salary;
	private Float commission_pct;
	private Integer manager_id;
	private Integer department_id;
	
	public Employee(ResultSet rs) throws SQLException {
		employee_id = rs.getInt("employee_id");
		first_name = rs.getString("first_name");
		last_name = rs.getString("last_name");
		email = rs.getString("email");
		phone_number = rs.getString("phone_number");
		hire_Date = rs.getDate("hire_Date");
		job_id = rs.getString("job_id");
		salary = rs.getFloat("salary");
		commission_pct = rs.getFloat("commission_pct");
		manager_id = rs.getInt("manager_id");
		department_id = rs.getInt("department_id");
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public Date getHire_Date() {
		return hire_Date;
	}
	public void setHire_Date(Date hire_Date) {
		this.hire_Date = hire_Date;
	}
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public Float getSalary() {
		return salary;
	}
	public void setSalary(Float salary) {
		this.salary = salary;
	}
	public Float getCommission_pct() {
		return commission_pct;
	}
	public void setCommission_pct(Float commission_pct) {
		this.commission_pct = commission_pct;
	}
	public Integer getManager_id() {
		return manager_id;
	}
	public void setManager_id(Integer manager_id) {
		this.manager_id = manager_id;
	}
	public Integer getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}

	@Override
	public String toString() {
		return "Employee [employee_id=" + employee_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", email=" + email + ", phone_number=" + phone_number + ", hire_Date=" + hire_Date + ", job_id="
				+ job_id + ", salary=" + salary + ", commission_pct=" + commission_pct + ", manager_id=" + manager_id
				+ ", department_id=" + department_id + "]";
	}

	

	
	
	
}