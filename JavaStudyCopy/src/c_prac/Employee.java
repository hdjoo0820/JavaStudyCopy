package c_prac;

public class Employee {
	String name;
	int salary;
	
	public void getDetails() {
		System.out.println(String.format("%s: %d", name, salary));
	}
}
