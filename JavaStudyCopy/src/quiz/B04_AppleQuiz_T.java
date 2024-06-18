package quiz;

import java.util.Scanner;

public class B04_AppleQuiz_T {
	
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);	
		int bucketSize = 10;
		int bucketQty;
		int appleQty;		
		System.out.println("바구니의 크기: " + bucketSize);
		System.out.print("사과의 개수: ");
		appleQty = sc.nextInt();		
		// ※ 조건을 짤 때 안되는 값부터 먼저 걸러내면 편해진다		
		if (appleQty < 0) {
			System.out.println("[경고] 사과 개수가 이상합니다");
			bucketQty = -1; // 바구니 개수를 -1로 설정해 오류임을 표시
		} else if (appleQty % bucketSize > 0) {
			bucketQty = appleQty / 10 + 1;		
		} else {
			bucketQty = appleQty / 10;
		}
			// 사과가 바구니의 크기로 딱 나누어 떨어질때와 아닐때에 대비해야 한다		
		if (bucketQty != -1) {
			System.out.printf("사과 %d개를 담기위해 필요한 바구니의 개수는"
				+ "%d개 입니다.\n",appleQty, bucketQty);
		}else {
			System.out.println("시스템 오류입니다");
		}	
	}
}
