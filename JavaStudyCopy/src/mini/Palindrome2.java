package mini;

import java.util.Scanner;

public class Palindrome2 {

	// 원래 단어와 거꾸로 뒤집은 단어가 같으면 좌우대칭
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int len = word.length();
		boolean c = true;
		for (int i = 0; i < len; ++i) {
			char a = word.charAt(i);
			char b = word.charAt(len - 1 - i);
			
		}
	}

}
