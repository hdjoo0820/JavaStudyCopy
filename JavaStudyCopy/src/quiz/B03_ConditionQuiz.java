package quiz;

public class B03_ConditionQuiz {
	
	/*
		# 알 맞은 비교 연산을 만들어보세요
		
		1. int형 변수 a가 10보다 크고 20보다 작을 때 true
		2. int형 변수 b가 짝수일 때 true
		3. int형 변수 c가 7의 배수일 때 true
		4. int형 변수 d와 e의 차이가 30일 때 true
		5. int형 변수 year가 400으로 나누어 떨어지거나
		   또는 4로 나누어 떨어지고 100으로 나누어 떨어지지 않을 때 true
		6. boolean형 변수 powerOn이 false일 때 true
		7. 문자열 참조변수 str이 "yes"일 때 true
	*/
	public static void main(String[] args) { 
		int a = 11;
		System.out.println(a > 10 && a < 20);
		
		int b = 15;  
		System.out.println(b / 2 == 0);
		
		int c = 14;
		System.out.println(c / 7 == 0);
		
		int d = 50, e = 20;
		System.out.println(Math.abs(d - e) == 30);
		
		int year = 2024;
		System.out.println((year / 400) == 0 || (year / 4) + (year / 100 ) == 0);
		
		boolean powerOn = !true;
		System.out.println(!powerOn);
		
		String str = "yes";
		System.out.println(str=="yes");
	}

}
