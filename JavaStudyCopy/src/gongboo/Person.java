package gongboo;

public class Person {
	String name;
	int height;
	double weight;
	char gender;
	boolean married;
	int age;
	int numChi;
	
	public Person(String name, int height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	
	public Person(String pname) {
		name = pname;
	}
}
