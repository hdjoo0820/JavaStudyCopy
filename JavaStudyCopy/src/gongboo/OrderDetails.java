package gongboo;

public class OrderDetails {

	public static void main(String[] args) {
		Order a = new Order();
		a.orderNum = "201803120001";
		a.orderID = "abc123";
		a.setDay(2018, 3, 12);
		a.orderName = "홍길순";
		a.proNum = "PD0345-12";
		a.address = "서울시 영등포구 여의도동 20번지";
		a.printDay();
	}

}
