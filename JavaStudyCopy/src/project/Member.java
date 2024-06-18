package project;

public class Member {
	String userID;
	String name;
	int age;
		
	public Member(String name, String userID, int age) {
		this.name = name;
		this.userID = userID;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getUserID() {
		return userID;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setUserID(String userID) {
		this.userID = userID;
	}

	@Override
	public String toString() {
		
		return String.format("이름: %s 아이디: %s 나이: %d", name, userID, age);
	}
	
	public static void main(String[] args) {
	Member hong = new Member("홍길동", "user01", 100);
	System.out.println(hong);
	}
}
