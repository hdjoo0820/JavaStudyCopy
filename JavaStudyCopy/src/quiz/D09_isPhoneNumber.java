package quiz;

import java.util.Scanner;

public class D09_isPhoneNumber {
	int num;
	 /*
	  	전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("번호입력...");		
		String phoneNum = "010-1234-1234";
		String noGapNum = phoneNum.trim();
		String truNum = noGapNum.replace("-", "");
		boolean num = true;
		
		while (true) {	
			if (truNum.length() >= 12 || truNum.length() < 11) {
				System.out.println("번호의 개수가 틀림");
				break;
			}
			
			for (int i = 0; i < truNum.length(); ++i) {
				char ch = truNum.charAt(i);
				if (!(ch >= '0' && ch <= '9')) {
					System.out.println("번호가 틀림");
					num = false;
					break;
				} 
			}
			
			for (int i = 0; i < 3; ++i) {
				char ch = truNum.charAt(i);
				switch (i) {
					case 0:
						if (ch == '0') {
							continue;
						} else {
							System.out.println(
									"맨앞 3자리가 010이 맞는지 확인");
							num = false;
							break;
						}
					case 1:
						if (ch == '1') {
							continue;
						} else {
							System.out.println(
									"맨앞 3자리가 010이 맞는지 확인");
							num = false;
							break;
						}
					case 2:
						if (ch == '0') {
							continue;
						} else {
							System.out.println(
									"맨앞 3자리가 010이 맞는지 확인");
							num = false;
							break;
						}
				}
			}
			
			if (num) {
				System.out.println("번호가 맞음");
			}
			break;
		}
	}
}
