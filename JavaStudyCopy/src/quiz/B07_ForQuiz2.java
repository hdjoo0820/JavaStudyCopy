package quiz;

public class B07_ForQuiz2 {
	// for 문을 사용해 숫자를 다음과 같이 출력
	// 1. 0 3 6 9 12 ... 93 96 99
	// 2. -35 -28 -21 ... 0 7 14 ...35
	// 3. 100 200 300... 800 900 1000
	// 4. 100 99 98 ... 5 4 3 2 1 0
	// 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9(30번)반복
	// 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ...(30번)반복
	// 7. 7 77 777 7777 77777 ... 7777777777
	public static void main(String[] args) {

	for (int i = 0; i <= 100; ++i) {
		if (i % 3 == 0) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	
	for (int i = -35; i <= 35; ++i) {
		if (i % 7 == 0) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	
	for (int i = 100; i <= 1000; ++i) {
		if (i % 100 == 0) {
			System.out.printf("%d ", i);
		}
		System.out.println();
	}
	
	for (int i = 100; i >= 0; --i) {
		System.out.printf("%d ", i);
	} 
		System.out.println();
		
	for (int cnt = 0; cnt < 30; ++cnt) {
		for (int a = 0; a <= 9; ++a){		  
			System.out.printf("%d", a);
		}
	}	
		System.out.println();
	
	for (int cnt = 0; cnt < 30; ++cnt) {
		for (int b = 10; b >= 1; --b) {
			System.out.printf("%d", b);
		}	
	}
	// 7. 7 77 777 7777 77777 ... 7777777777
	String c = "7";
	for (int cnt = 1; cnt <= 10; ++cnt) {
		for (int a = 0; a < cnt; ++ a) {
			System.out.printf(" ", c);
		}
	}
	
	
	
	
	
	
	
	}
}
