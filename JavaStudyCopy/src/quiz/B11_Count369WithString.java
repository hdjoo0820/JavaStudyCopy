package quiz;

import java.util.Scanner;

public class B11_Count369WithString {
	/*
	 *  사용자가 숫자를 입력하면
	 * 	해당 숫자까지 369게임이 진행됐을 때
	 * 	박수를 총 몇 번 쳐야하는지 출력해보세요 51 54 57
	 * 
	 * 	1. 숫자를 문자열로 취급하여 검사하는 방식
	 * 
	 * 	2. 그냥 숫자로 검사하는 방식
	 * 	   34346
	 * 	   1의 자리에 3의 배수, 10의 자리에 3의 배수, 100의 자리에 3의 배수, ...
	 */
	
	public static void main(String[] args) {
		boolean DEBUG_MODE = false;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("...");
		int targetNum = sc.nextInt();
		
		int totalClapCount = 0;
		
		for (int i = 1; i <= targetNum; ++i) { // 번호만큼 반복 3이면 3만큼 
			if (DEBUG_MODE) {
			System.out.print(i + "\t: ");
			}	
			String numStr = "" + i;
			
			int len = numStr.length();
			for (int index = 0; index < len; ++index) { // 번호안에 있는 조건 찾기 for문 두번쓸것
				
				char ch = numStr.charAt(index);
				if (ch == '3' || ch == '6' || ch == '9') {
					++totalClapCount;
					if (DEBUG_MODE) {
					System.out.print("짝");
					}
				}
			}
			if (DEBUG_MODE) {
			System.out.println();
			}
		}		
		System.out.printf("%d까지 369를 진행하면 박수를 총 %d번 쳐야합니다.\n",
				targetNum, totalClapCount);
	
	}

}
