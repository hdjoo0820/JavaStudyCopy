package quiz;
import java.util.Scanner;
public class B00_WonToDollar {
	/* 
	 * 한국 돈을 입력하면 달러로 얼마인지 출력해주는 프로그램을 만들어보세요
	 * (환율은 현재 환율 검색)	  1,374.50 원
	 */
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("한국 돈을 입력하세요 >> ");
	int krw = sc.nextInt();
	double usd = 1374.50;
	double exchangeRate = krw / usd;

	System.out.printf("(%d원)을 (%.2f)달러환율로 계산하면 (%.2f달러입니다)", krw, usd, exchangeRate);
	}
	
}