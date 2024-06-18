package database.model;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Job {
	
	private String job_id;
	private String job_title;
	private Float min_salary;
	private Float max_salary;
	
	public Job(ResultSet rs) throws SQLException {
		job_id = rs.getString(1);
		job_title = rs.getString(2);
		min_salary = rs.getFloat(3);
		max_salary = rs.getFloat(4);
	}
	
	public String getJob_id() {
		return job_id;
	}
	public void setJob_id(String job_id) {
		this.job_id = job_id;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public Float getMin_salary() {
		return min_salary;
	}
	public void setMin_salary(Float min_salary) {
		this.min_salary = min_salary;
	}
	public Float getMax_salary() {
		return max_salary;
	}
	public void setMax_salary(Float max_salary) {
		this.max_salary = max_salary;
	}

	@Override
	public String toString() {
		return "Job [job_id=" + job_id + ", job_title=" + job_title + ", min_salary=" + min_salary + ", max_salary="
				+ max_salary + "]";
	}
	
}
