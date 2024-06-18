package mini;

import java.util.Scanner;

public class Digit {

	
//	(1). 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지
//	 알려주는 프로그램을 만드시오
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자..");
		int num = sc.nextInt();
		int num1 = num;
		int cnt = 0;
		while (num > 0) {
			num /= 10;
			++cnt;
		}
		System.out.printf("%d: %d째 자리 숫자", num1, cnt);
		
		
		
		
		
		
	
	}
}
