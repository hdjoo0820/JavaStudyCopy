package quiz;

import java.util.Random;

public class B12_TempPassword {
	// 알파벳 대문자로만 구성된 랜덤 4자리 비밀번호를 20개 생성하여 출력
	// char 'A' 65     90'Z'   digit 	pass  	    print  	 
	public static void main(String[] args) {

		for (int i = 0; i < 20; ++i) {
			String password = "";
			for (int keyLen = 0; keyLen < 4; ++keyLen) {
				password += (char)(Math.random() * 26 + 65);
			}
			System.out.println(i +"번째 비밀번호: " + password);
		}
	
				Random ran = new Random();
			
		for (int pass = 1; pass <= 20; ++pass) {
			System.out.print(pass + "번째비밀번호 :");
			
			for (int digit = 0; digit < 4; ++digit) {
				System.out.print((char)(ran.nextInt(25) + 'A'));
				
			}	
			System.out.println();
	}
	
	}

}
