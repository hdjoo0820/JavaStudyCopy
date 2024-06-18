package mini;

import java.util.Scanner;

public class Season {
//	사용자로부터 몇월인지 입력받으면 해당하는 계절을 출력해보세요
//	(switch-case문, if문으로 한번씩)
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 월인지 입력: ");
		int mon = sc.nextInt();
		String  Str;
//		switch(mon) {
//		case 12:
//		case 1:
//		case 2:
//			System.out.printf("%d월은 겨울입니다", mon);
//			break;
//		case 3:
//		case 4:
//		case 5:
//			System.out.printf("%d월은 봄입니다", mon);
//			break;
//		case 6:
//		case 7:
//		case 8:
//			System.out.printf("%d월은 여름입니다", mon);
//			default:
//		case 9:
//		case 10:
//		case 11:
//			System.out.printf("%d월은 가을입니다", mon);
//		}
		
		
		if(mon ==12 || mon < 2) {
			Str = "겨울";
		} else if (mon < 3 || mon < 5) {
			Str = "봄";
		} else if (mon < 6 || mon < 9) {
			Str = "여름";
		} else {
			Str = "가을";
		} 
		
		System.out.printf("%d월은 %s입니다", mon, Str);
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
