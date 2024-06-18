
public class B02_Operator1 {
	/*
	  	# 연산자 (Operator)
	  
	  	- 계산할 때 값과 함께 사용하는 것
	  	- +, -, *, /, >, <, >=, ...
	  	
	  	# 산술 연산자
	  	
	  	  + : 더하기
	  	  - : 빼기
	  	  * : 곱하기
	  	  / : 나누기 (※ 정수로 나눌 때와 실수로 나눌 때의 결과가 다름)
	  	  % : 나머지  
	 */	
	public static void main(String[] args) {
		int a = 15, b = 7;
		double c = 7.0;
		
		// +, -는 str + int str - int가 되서 뒤에 ()를 써줘야 한다
		// printf를 쓰면 ()안써도된다
		System.out.printf("a + b: %d\n", a + b);
		System.out.printf("a - b: %d\n", a - b);
		System.out.printf("a * b: %d\n", a * b);
		
		//정수와 정수의 연산 => 정수
		//정수와 실수의 연산 => 실수
		
		int result1 = (int)(a + c);
		double result2 = a + c;
			
		System.out.println("a + b: " + (a + b));
		System.out.println("a + c: " + (a + c));
		System.out.println("a - b: " + (a - b));
		System.out.println("a - c: " + (a - c));
		System.out.println("a * b: " + a * b);
		System.out.println("a * c: " + a * c);	
		System.out.println("(정수 끼리의 나누기) a / b:" + a / b);// 2
		System.out.println("(정수와 실수 나누기) a / c:" + a / c);
		//나누고 남은 수를 줌 15/7 = 2와 나머지 1이라 1이 나옴
		System.out.println("a % b: " + a % b); 
		System.out.println(a % c);
		
		// Math.abs(x) : x의 절대값을 구하는 함수
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		// Math.round(x) : x를 소수 첫째 자리에서 반올림해주는 함수
		System.out.println(Math.round(1.55)); // 2
		
		// Math.ceil(x) : x를 소수 첫째 자리에서 올림해주는 함수
		System.out.println(Math.ceil(1.11)); // 2.0
		
		// Math.floor(x) : x를 소수 첫째 자리에서 내림해주는 함수
		System.out.println(Math.floor(1.99)); // 1.0
		
		// Math.pow(x, y) : x의 y제곱을 구하는 함수
		System.out.println(Math.pow(2, 10));
		
		// Math.sqrt(x) : x의 제곱근을 구하는 함수
		System.out.println(Math.sqrt(49)); // 7.0
		System.out.println(Math.sqrt(48)); //6.9...
		System.out.println(Math.sqrt(9)); // 3.0
		
		// Math.max(x, y) : 두 값 중 더 큰 값을 구하는 함수
		System.out.println(Math.max(-3, 99)); // 99
		
		// Math.min(x, y) : 두 값 중 더 작은 값을 구하는 함수
		System.out.println(Math.min(-3, 99)); // -3		
	}
}
