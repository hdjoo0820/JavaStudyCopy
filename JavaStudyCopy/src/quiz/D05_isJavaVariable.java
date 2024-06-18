package quiz;

import java.util.Scanner;

public class D05_isJavaVariable {
	/*
	  	사용자로부터 문자열을 입력받으면
	  	해당 문자열이 자바의 변수로 사용할 수 있는 문자열인지 검사해보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 입력 ...");
		String word = sc.next();
		boolean identifier = true;
		
		for (int i =0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			// i 가 첫번째 일때 isJavaIdentifierStart 로 확인
			if (i == 0 && !(Character.isJavaIdentifierStart(ch))) {
				System.out.println("변수 맨 앞 문자로 활용할 수 없습니다");
				// 맨 앞에 쓸 수 있으면 넘어가고 못 쓰면 반복문 탈출
				identifier = false;
				break;
				// 문자열을 isJavaIdentifierPart로 비교
			} else if (!(Character.isJavaIdentifierPart(ch))) {
				System.out.println("변수로 활용할 수 없습니다");
				// 변수로 못쓰면 반복문 탈출
				identifier = false;
				break;
			} else {
				// 위의 조건 만족다 만족하면 콘솔에 출력
				System.out.println("시작문자로도 변수로도 활용할 수 있습니다");
			}
		}
		
		
	}
	
}
