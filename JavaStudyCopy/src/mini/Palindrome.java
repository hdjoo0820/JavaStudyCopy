package mini;

import java.util.Scanner;

/*
	 사용자가 단어를 입력하면
	 해당 단어가 좌우대칭을 이루는 단어인지 판별해주는 프로그램을 만드시오
	 
	  	  >> LEVEL      
	  	  -> 좌우대칭
	  	  
	  	  >> Apple
	  	  -> 좌우대칭이 아님
	  	  
	  	  >> BOB
	  	  -> 좌우대칭
	  	  
	  	  >> ABBA
	  	  -> 좌우대칭
*/
public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("...");
		String word = sc.next();
		int len = word.length();
		int half = len /2;
		boolean c = true;
		for (int i = 0; i < len; ++i) {
			char a = word.charAt(i);
			char b = word.charAt(len - 1 - i);
			if (a != b) {
				c = false;
			} 
		}
		if (c) {
			System.out.printf("%s : 좌우대칭이 맞음", word);
		} else
			System.out.printf("%s : 좌우대칭이 아님", word);
		
		
		
		
		
	}

}
