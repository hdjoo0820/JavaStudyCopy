package c_prac;

public class Manager extends Employee{
	String department;
	
	@Override
	public void getDetails() {
		super.getDetails();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		
		e1.name = "abdcad";
		e1.salary = 123125;
		
		e1.getDetails();
	}
}
