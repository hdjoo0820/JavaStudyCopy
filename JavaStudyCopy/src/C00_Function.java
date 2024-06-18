
public class C00_Function {
	/*
		# 함수 (Function)
		
		- 기능을 미리 정의해두고 나중에 불러서 쓰는 것
		- 함수는 미리 정의만 해둔것이기 때문에 어딘가에서 호출하지 않으면
		  아무것도 실행되지 않는다
		  
		# 함수의 매개변수 (Parameter)
		
		- 함수를 호출할 때 해당 함수에 원하는 값을 전달하기 위해 만들어두는 변수
		- 함수를 호출할 때 ()에 순서대로 값을 전달해야 하고 이 값을 
		  인자(Argument)라고 부른다
		- 함수를 정의할 때 ()에 인자를 받기위해 서언하는 변수를 매개변수라고 부른다
		- 매개변수의 개수에는 제한이 없다
		- 매개변수가 몇 개 올지 모를때 ...을 활용하면 인자를 무한대로 받을 수 있다  
		
		# 함수의 리턴 타입
		
		- 함수의 이름 앞에 붙이는 타입은 해당 함수를 호출하고 난 후 
		  반환되는 값의 타입을 의미한다
		- void는 반환되는 값이 아무것도 없는 함수라는 뜻이다 
		- 함수의 리턴 타입이 void가 아닌 함수는 반드시 return을 통해
		  함수를 호출한 곳에 값을 반환해야 한다 
		  
		# return
		
		- 리턴 타입이 void가 아닌 함수에서는 반드시 실행되어야 한다
		- 함수 내에서 return을 만나는 즉시 해당 함수를 종료하고 
		  호출한 곳으로 값을 반환한다
		
	*/
	public static void rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(   >)");
	}
	
	public static void printNumber() {
		for (int i = 0; i < 10; ++i) {
			System.out.println(i);
		}
	}
	
	// 나중에 받을 값으로 미리 로직을 구성할 수 있다
	public static void plusNumbers(int num1, int num2) {
		int a = 1;
		System.out.println(num1 + num2);
	}
	
	public static void repeatNumbers(int num, int times) {
		int a = 3;
		for (int i = 0; i < times; ++i) {
			System.out.printf("[%-2d] %d가 %d번 반복되는 함수입니다.\n", i, num, times);
		}
	}
	
	// 연습: 원하는 단을 전달하면 해당 단의 구구단을 출력해주는 함수를 정의
	
	public static void gugudan(int dan) { 
			for (int j = 1; j <= 9; ++j) {					
				System.out.printf("%d x %d = %d\n", dan, j, dan*j);
			}
	}
	
	// int... : 해당 타입을 1개 이상 받을 수 있지만 배열타입(int[][])으로 받는다
	public static void plusAll(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; ++i) {
			sum += num[i];
		}
		System.out.println("전달한 모든 숫자의 합은 " + sum + "입니다.");
	}

	// type...을 쓰고 난 이후에는 다른 매개변수를 선언할 수 없다
	// type...은 항상 가장 마지막 매개변수로 사용해야 한다
//	public static void minusAll(int... num, String str) {
//		
//	}
	
	// void : 이 함수는 호출해봤자 아무값도 돌려받지 못합니다
	public static void plus1(int num) {
		System.out.println(num + 1);
	}
	
	// int : 이 함수는 호출하면 무조건 int값을 돌려줍니다
	public static int plus2(int num) {
		// return : 함수를 호출한 곳에 원하는 값을 돌려주는 문법
		return num +2; // return에 10을 넣으면 main에 int result = plus2(1); 을 해도 10이 나옴		
	}
	
	public static boolean allEven(int[] arr) {
		boolean allEven = true;
		
		for (int i = 0; i < arr.length; ++i) {
			if (arr[i] % 2 == 1) {
				return false;
			}
		}		
		return true;
	}
	
	// 연습 : 사과의 개수와 바구니의 크기를 전달하면 
	// 필요한 바구니의 개수를 리턴 해주는 함수
	
	public static int getBasketCount(int appleCount, int basketSize) {
		if (appleCount < 0 || basketSize < 0) {
			return -1;
		}
		
		return appleCount % basketSize == 0 ?
				appleCount / basketSize : appleCount / basketSize + 1;
//		if (appleCount % basketSize == 0){
//			return  appleCount / basketSize;
//		} else {
//			return  appleCount / basketSize + 1;
//		}				
	}
	
	public static int getBasketCount2(int appleCount, int basketSize) {
		if (appleCount < 0 || basketSize < 0) {
			return -1;
		}
		
		int cnt = 0;
		
		while (appleCount > 0) {
			appleCount -= basketSize;
			++cnt;
		}
		
		return cnt;
	}
	
	public static void main(String[] args) {
//		rabbit();
//		printNumber();
//		plusNumbers(9, 16);
//		plusNumbers(25, 3);
//		repeatNumbers(9, 30);
//		gugudan(5);
//		plusAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		plusAll(1, 5, 10);
//		plusAll();
//		System.out.println("모두 짝수? " + 
//                allEven(new int[] {2, 4, 6, 8}));
//		System.out.println("모두 짝수? " + 
//                allEven(new int[] {2, 4, 3, 8}));
		System.out.println(getBasketCount(55, 5));
		System.out.println(getBasketCount(56, 5));
		System.out.println(getBasketCount2(43, 10));
		System.out.println(getBasketCount2(40, 10));
		System.out.println("프로그램이 끝났습니다.");
		
	}

}
