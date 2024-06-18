package quiz;

import java.util.Scanner;

public class B11_Prime_T {

	/*
	 * 사용자가 정수를 입력하면 
	 * 1부터 입력한 숫자 사이에 존재하는 
	 * 모든 소수를 출력 
	 * 소수(prime) : 약수가 1과 자기 자신밖에 없는 수
	 * (2, 3, 5, 7, 11, 13, ..)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" ");
		int targetNum = sc.nextInt();
		int cnt = 0;
		// 해당 숫자를 1과 자기 자신을 제외한 숫자로 나누어 봤을 때
		// 나누어 떨어지는 숫자가 존재한다면
		// 소수가 아니다
		
		for (int checkNum = 2; checkNum <= targetNum; ++checkNum) {
			boolean isPrime = true;			
			
			System.out.print(checkNum + "\t:");
			
			double sqrt = Math.sqrt(checkNum);
			// 1과 자기자신을 제외한 모든 숫자로 나눠본다
			// (2부터 체크하는 숫자의 제곱근까지 나눠본다)
			for (int divider = 2; divider < sqrt; ++divider) {
				// 나누어 떨어지는게 하나라도 존재한다면 더 이상 소수가 아니므로
				// 검사를 그만해도 된다
				if (checkNum % divider == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.println("소수");
			} else {
				System.out.println("X");
			}
		}
//		 2부터 사용자가 입력한 숫자까지 있는 모든 숫자의 약수 개수를 체크한다
//		 해당 숫자의 약수가 2개라면 그 숫자는 소수다. 
//		for (int checkNum = 2; checkNum <= targetNum; ++checkNum) {
//			int yaksuCount = 0;
//			System.out.print(checkNum + "\t: [");			
//			for (int divider = 1; divider <= checkNum; ++divider) {
//				// 각 숫자의 약수를 찾아서 개수를 센다
//				if (checkNum % divider == 0) {
//					if (divider != checkNum) {
//						System.out.print(divider + ", ");
//					} else {
//						System.out.print(divider + "]");
//					}
//					++yaksuCount;					
//				}
//			}
//			
//			if (yaksuCount == 2) {
//				System.out.print(" *소수");
//			}
//			System.out.println(); 
//		}
//		
	}

}
