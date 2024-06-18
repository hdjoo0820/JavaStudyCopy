package quiz;

import java.util.Scanner;

//	 사용자로부터 숫자를 입력받으면
//	 0부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한줄에 6개씩 출력
//	 (단, 음수를 입력 받는 경우에도 올바르게 동작)
public class B07_ForQuiz3_T {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력: ");
		int target = sc.nextInt();
		int absValue = Math.abs(target);
		
		for (int i = 0, cnt = 0; i <= absValue; ++i) {
			if (i % 3== 0) {
				if(target < 0) {
					System.out.printf("%d\t", -i);
				} else {
					System.out.printf("%d\t", i);
				}
				
				if (++cnt % 6 == 0) {
					System.out.println();
				}
			}
		}
//		for (int i = 0, cnt = 0; i <= a; ++i) {
//			if (i % 3 == 0) {
//				System.out.printf("%4d", i); ++cnt;								
//			} if (cnt % 6 == 0) {
//					  System.out.println();
//			}	
//		}
//		
//		for (int i = 0, cnt1 = 0; i >= a; --i) {
//			if (i % 3 == -0) {
//				System.out.printf("%4d", i); ++cnt1;
//			} if (cnt1 % 6 == 0) {
//				  System.out.println();
//			}	  
//		}
						
	}
}

