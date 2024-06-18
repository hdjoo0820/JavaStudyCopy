package quiz;
import java.util.Scanner;
public class B03_ConditionQuiz2 {

	public static void main(String[] args) { 
//			# 알맞은 조건식을 만들어보세요
//			
//			1. char형 변수 a가 'q'또는 'Q'일 때 true
//			2. char형 변수 b가 공백이나 탭이 아닐 때 true
//			3. char형 변수 c가 '0' ~ '9' 일 때 true
//			4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true 65~ 122
//			5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색) 유니코드 값은 AC00부터 D7A3까지며, 총 11,172개
//			6. 사용자가 입력한 문자열이 quit일 때 true

		char a = 'q'; 
		System.out.println(a == 'q' || a == 'Q');
		
		char b = ' ';
		System.out.println(b == ' ' || b == '\t');
		
		char c = '0';
		System.out.println(c <= '0' || c >= '9');
		
		char d = 'a';
		System.out.println();
		
		char e = '가';
		System.out.println();
		
		System.out.println("문자열을 입력 >>");
		String str = new Scanner(System.in).next();
		System.out.println(str.equals("quiz"));	
	}

}
