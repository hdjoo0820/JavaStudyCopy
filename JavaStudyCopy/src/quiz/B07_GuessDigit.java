package quiz;

import java.util.Scanner;

public class B07_GuessDigit {
	/*
		(1). 사용자가 어떤 숫자를 int타입으로 입력하면 해당 숫자가 몇 자리 숫자인지
			 알려주는 프로그램을 만드시오
	*/
	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	System.out.print("숫자: ");
	int num = sc.nextInt();

	int cnt;
	for (cnt = 0; num > 0; num /= 10) {
		++cnt;
	}
		System.out.println(cnt + "자리 숫자 입니다.");
	//	System.out.println((int)(Math.log10(num)) + 1);

	//	int cnt;
//	for (cnt = 0; num > 0; num /= 10) {
//		++cnt;
//	}
//	System.out.println(cnt + "자리 숫자입니다.");
	

	//	int cnt = 1;
//	for (int compare = 10; num >= compare; compare *= 10) {
//		++cnt;
//	}
//	
//	System.out.println(cnt + "자리 입니다.");
//	
	
	//	for (int i = 0, cnt = 0; i < num; i %= 10) {
//		if (num < 0) {
//			System.out.printf("%d: \n" + "첫째 자리 숫자입니다.\n", num);			
//		} else {
//			System.out.printf("%d: \n" + "%d째 자리 숫자입니다.\n", num, ++cnt);
//		}
//	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	}	

}
