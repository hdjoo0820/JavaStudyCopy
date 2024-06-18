package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D10_CaesarCipher {
	/*
	  	# 시저(카이사르) 암호
	  	
	  	- 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 변경하여 암호문을
	  	  생성하는 암호 알고리즘
	  	  
	  	  [표]
	  	  
	  	  ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+
	  	  abcdefghijklmnopqrstuvwxyz {}[]|\;:'"/?<>,.
	  	  
	  	  # 암호화
	  	  (평문)			key:3       (암호문)
	 	  HELLO!	 ---------->    KHOOR!
	 	  # 복호화
	 	  				key:3
	 	  HELLO!    <-----------	KHOOR!			
	 	  
	 	1. 평문과 키 값이 전달되면 해당 평문을 암호문으로 변환하여 리턴해주는 메서드
	 	
	 	2. 암호문과 키 값이 전달되면 해당 암호문을 평문으로 변환하여 리턴해주는 메서드
	 	
	 	3. 암호화 할 수 있는 문자의 종류: 영어 대문자, 소문자, 숫자, 특수문자
	 */
	public static String codeTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*()-_=+"
				+ "abcdefghijklmnopqrstuvwxyz {}[]|\\;:'\"/?<>,.";
	
	public static String ency(String plainText, int key) {
		StringBuilder sb = new StringBuilder();
		int len = plainText.length();
		key = key % codeTable.length();
		for (int i = 0; i < len; ++i) {
			int index = codeTable.indexOf(plainText.charAt(i));
			int len3 = index + key;
			if (len3 >= codeTable.length()) {
				index = len3 - codeTable.length();
				sb.append(codeTable.charAt(index));
			} else {
				sb.append(codeTable.charAt(index + key));
			}
			

		}
		
		return sb.toString();
	}
	

	public static void main(String[] args) {
		int len2 = codeTable.length();
		System.out.println(len2);
		System.out.println(ency("da21^*^%$#3sda", 9999));
		
	}
}
