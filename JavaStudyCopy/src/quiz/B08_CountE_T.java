package quiz;

import java.util.Scanner;

public class B08_CountE_T {

//	사용자가 문장을 입력하면 해당 문장에 포함된 알파벳 e의 개수를 출력
//	알파벳 e의 개수를 출력하는 프로그램 (대/소문자 모두 개수에 포함)
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("text: ");
	String text = sc.nextLine();	
	
	// 0부터 입력한 문장의 길이 -1 까지 i를 반복
	int cnt = 0;
	int len = text.length();
	for (int i = 0; i < len; ++i) {
		char ch = text.charAt(i);
		if (ch == 'e' || ch == 'E') {
			++cnt;
		}
	}
	System.out.println("e 또는 E가 나온 횟수: " + cnt);

	//	int cnt = 0;
//	for (int i = 0; i < text.length(); ++i) {
//		char a = text.charAt(i);
//		if (a == 'E' || a == 'e') {
//			++cnt;
//			System.out.printf("e나 E의 개수: %d\n", cnt);
//		}
//		
//	}
		
	}

}
