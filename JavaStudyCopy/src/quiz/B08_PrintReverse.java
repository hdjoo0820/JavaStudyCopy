package quiz;

import java.util.Scanner;

public class B08_PrintReverse {
	
//	사용자가 문장을 입력하면 해당 문장을 거꾸로 출력
	public static void main(String[] arg) {
	Scanner sc = new Scanner(System.in);
	System.out.print("문장 입력");
	String text = sc.nextLine();
	
	// 마지막 인덱스부터 0까지 반복하며 한글자씩 출력
	for (int i = text.length() - 1; i >= 0; --i) {
		System.out.println(text.charAt(i));
	}
	System.out.println();
	
	// 마지막 인덱스에서 1씩 더 빼면서 한 글자씩 출력
	int len = text.length();
	for (int i = 0; i < len; ++i) {
		System.out.println(text.charAt(len - 1 -i));
	}
	System.out.println();
	//	System.out.print("문장내놔");
	//String text = sc.nextLine();
	
//	len = text.length(text);
//
//		for (int i = len - 1; i >= 0; --i) {
//	}

	
	}
}
