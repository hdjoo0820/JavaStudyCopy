package quiz;
import java.util.Scanner;
public class B03_ConditionQuiz3 {

	public static void main(String[] args) {
		/*두 개의 변수 a와 b가 주어졌을 때, a와 b의 합이 양수이고 a와 b의 곱이 -10과 같다면 "조건이 충족됩니다", 
		  그렇지 않으면 "조건이 충족되지 않습니다"를 출력하는 프로그램을 작성하세요.
		// 문자열 비교는 ==으로 하면 안된다
		// 문자열 비교는 equals()
		// IgnoreCase 안쓰면 경우의 수 만큼 써야함
		// IgnoreCase= 대소문자 상관없이 같은 문자열인지 비교
		*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 a 와 b를 입력하세요 >> ");
		
		int a = sc.nextInt(); 
		int b = sc.nextInt();
		System.out.println("입력하신 숫자는 " +  a + ('와') + b + "입니다");
		String str1 ="조건이 충족됩니다";
		String str2 ="조건이 충족되지 않습니다";
		
		if (a + b >= 0 && a * b == -10){
			System.out.println(str1);
		} else {
			System.out.println(str2);			
		}	
	}

}
