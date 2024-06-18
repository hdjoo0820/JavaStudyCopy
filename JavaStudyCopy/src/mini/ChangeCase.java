package mini;

import java.util.Scanner;

public class ChangeCase {
	// 사용자가 영어로된 문장을 입력하면 대소문자를 반대로 바꿔서 출력해주는 프로그램 
	// +32 -32하면 대소문자
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("....");
		String text = sc.nextLine();
		int len = text.length();
		int dif = Math.abs('A' - 'a');
		for (int i = 0; i < len; ++i) {
			char a = text.charAt(i);
			if (a >= 'A' && a<= 'Z') {
				System.out.print((char)(a + dif));
			} else if (a >= 'a' && a <= 'z') {
				System.out.print((char)(a - dif));
			} else
				System.out.print((char)a);
		}
	}
}
