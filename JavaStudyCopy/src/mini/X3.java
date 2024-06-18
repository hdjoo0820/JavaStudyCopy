package mini;

import java.util.Scanner;

public class X3 {

//	 사용자로부터 숫자를 입력받으면
//	 0부터 해당 숫자 사이에 존재하는 모든 3의 배수를 한줄에 6개씩 출력
//	 (단, 음수를 입력 받는 경우에도 올바르게 동작)
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("...");
		int num = sc.nextInt();
		int cnt = 0;
		int i = 0;
		while (i <= num) {
			if (i % 3 == 0) {	
				++cnt;
				System.out.printf("%-3d", i);		
			} if (cnt == 6) {
				System.out.println();
			}
			++i;
		}
		
		while (i >= num) {
			if (i % 3 == -0) {	
				++cnt;
				System.out.printf("%-3d", i);		
			} if (cnt == 6) {
				System.out.println();
			}
			--i;
		}
		
		
		
//		for(int i = 0, cnt = 0; i >= num; --i) {
//			++cnt;
//			if (cnt % 3 == 0) {
//				System.out.printf("%4d", i);
//				if (cnt % 6 == 0) {
//					System.out.println();
//				}
//			}
//		}
	}

}
