package quiz;

import java.util.Scanner;

	/*
	   사용자로부터 스캐너의 nextInt()로 숫자를 입력받되
	   숫자가 아닌것을 입력하더라도 프로그램이 강제종료되지 않고
	   다시 입력받을 수 있게 만들어보세요
	*/
public class E01_NumberOnly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			try {				
				System.out.print("숫자 입력...");
				int num = sc.nextInt();
				break;
			} catch (Exception e) {
				System.out.println("입력된 값이 숫자가 아닙니다");
				String trash = sc.nextLine();
				System.out.println("통로에 남아있던 잘못된 문자: " + trash);
			} 
		}
		System.out.println("프로그램이 정상 종료되었습니다...");
	}
}
