package quiz;


public class B08_Palindrome {
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
	public static void main(String[] args) {
		
		String word = "LeveL";
		int len = word.length();
		
		boolean isPalindrome = true;
		int half = len /2;
		for (int i = 0; i < half; ++i) {
//			System.out.printf("%c vs %c\n", 
//					text.charAt(i), text.charAt(len - 1 -i));
			// ( 직접 쓰는 법 )
			// i    ch1		ch2
			//--------------------------
			// 0	0		len - 1 - 0
			// 1	1		len - 2
			// 2	2 		len - 3
			
			char ch1 = word.charAt(i);
			char ch2 = word.charAt(len - 1 - i);
			
			if (ch1 != ch2) {
				isPalindrome = false;
			}
		}
		
		if (isPalindrome) {
			System.out.println("\"" + word + "\"좌우 대칭 입니다");
		} else {
			System.out.println("\"" + word + "\"좌우 대칭이 아닙니다");
		}

		//		for (int i = 0; i <= len; ++i) {	
//			a = (i == 0 && 0 == len -1 - i);
//		} if (a) {
//			System.out.println("좌우대칭이 맞음");
//		} else {
//			System.out.println("좌우대칭이 아님");
//		}

	}
}
