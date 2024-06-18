package gongboo;

public class Order {
	String orderNum;
	String orderID;
	int day;
	int year;
	int mon;
	String orderName;
	String proNum;
	String address;
	
	public void setDay(int year, int mon, int day) {
		this.year = year;
		this.mon = mon;
		this.day = day;
	}
	
	public void printDay() {
		System.out.printf("%d년%d월%d일",year,mon,day);
	}
}
