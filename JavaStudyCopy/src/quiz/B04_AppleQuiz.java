package quiz;

import java.util.Scanner;

public class B04_AppleQuiz {
	
	public static void main(String[] args) {
		/*
			사과를 10개씩 담을 수 있는 바구니가 있을 때.
			사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
			바구니의 개수를 알려주는 프로그램을 만들어보세요.		
		*/
		Scanner sc = new Scanner(System.in);
		System.out.print("사과 개수를 입력..");
		int apple = sc.nextInt();
		int pack = apple / 10;
		 if (pack <= 0) {		
			System.out.println("사과의 개수가 이상함");		
		} else if (pack <= 0) {
		 System.out.println("바구니는 (1개) 필요합니다");			
		} else if (pack > 0) {
			System.out.printf("바구니는 (%d개) 필요 합니다", pack+1);
		}
			
			
	
	
	}

}
