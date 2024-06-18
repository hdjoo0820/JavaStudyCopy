package quiz;

import java.util.Scanner;

public class B03_ConditionQuiz2_T {

	public static void main(String[] args) {
		
		// 1. char형 변수 a가 'q'또는 'Q'일 때 true
		char a = 'q';
		System.out.println(a == 'q' || a == 'Q');
		
		// 2. char형 변수 b가 공백이나 탭이 아닐 때 true
		char b = '\t';
		System.out.println(b != '\t' && b != ' ');
		System.out.println(!(b == '\t' || b == ' '));
		
		// 3. char형 변수 c가 '0' ~ '9' 일 때 true
		char c = '김';
		System.out.println(c >= '0' && c <= '9');
		
		// 4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true 65~ 122
		char d = '이'; // 'A'=65 랑 같아서 () 필요없이 숫자만 적어도 됨
		System.out.println(d >= 'a' && d <= 'z' || d >= 'A' && d <= 'Z');
		
		// 5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색) 유니코드 값은 AC00부터 D7A3까지며, 총 11,172개
		char e = '차'; // 한글도 마찬가지로 숫자 알필요 없다 0xAC00= '가' ('가')대신 0xAC00써도됨
		System.out.println(e >= '가' && e <= '힣');
		
		// 6. 사용자가 입력한 문자열이 quit일 때 true
		Scanner sc = new Scanner(System.in);
		
		System.out.println("input command >> ");
		String cmd = sc.next();
		
		// 문자열 비교는 ==으로 하면 안된다
		System.out.println(cmd == "quit");
		
		// 문자열 비교는 equals()
		// IgnoreCase 안쓰면 경우의 수 만큼 써야함
		System.out.println(cmd.equals("quit")
				|| cmd.endsWith("QUIT") || cmd.equals("Quit")
				|| cmd.equals("quiT")); 
		
		// IgnoreCase= 대소문자 상관없이 같은 문자열인지 비교
		System.out.println(cmd.equalsIgnoreCase("quit"));
	}

}
