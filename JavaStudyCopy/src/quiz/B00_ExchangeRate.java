package quiz;

import java.util.Scanner;

public class B00_ExchangeRate {
	/*
	 *    달러(usd) 1,374.33 엔화(jpy) 8.90 파운드(gbp) 1,712.97
	 * 	  루블(rub)    14.57 
	 */	
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("KRW를 입력하세요 >> ");
	int krw = sc.nextInt();
	double usd = 1374.33;
	double exchangeRate = krw / usd;
	double jpy = 8.55;
	double exchangeRate2 = krw / jpy;
	double gbp = 1712.97;
	double exchangeRate3 = krw / gbp;
	double rub = 14.57;
	double exchangeRate4 = krw / rub;
	System.out.printf("(%d원)을 (%.2f달러) (%.2f엔화) "
			+ "(%.2f파운드) (%.2f루블)로 "
			+ "계산했을떄 나오는 값은\n"
			+ "각각\n(%.2f달러)\n(%.2f엔화)\n"
			+ "(%.2f파운드)\n(%.2f루블)\n"
			+ "입니다",
			   krw, usd, jpy, gbp, rub,
			  exchangeRate, exchangeRate2,
			  exchangeRate3, exchangeRate4);		
	}

}
