package mini;

public class For {
// for 문을 사용해 숫자를 다음과 같이 출력
// 1. 0 3 6 9 12 ... 93 96 99
// 2. -35 -28 -21 ... 0 7 14 ...35
// 3. 100 200 300... 800 900 1000
// 4. 100 99 98 ... 5 4 3 2 1 0
// 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9(30번)반복
// 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ...(30번)반복
// 7. 7 77 777 7777 77777 ... 7777777777
	public static void main(String[] args) {
//		for (int i = 0; i < 100; ++i) {
//			if (i % 3 == 0) {
//				System.out.printf("%d\t", i);
//			}
//		}
		
//		for (int i = -35; i <= 35; i += 7) {
//			System.out.printf("%d\t",i);
//		}
		
//		for (int i = 100; i <= 1000; i += 100) {
//			System.out.printf("%d\t",i);
//		}
		
//		for (int i = 100; i >= 0; --i) {
//			System.out.printf("%d\t",i);
//		}
		
//		for (int i = 0; i < 30; ++i) {
//			for (int j = 0; j <= 9; ++j) {
//				System.out.printf("%d\t",j);
//			}
//		}
		
//		for (int i = 0; i <= 30; ++i) {
//			for (int j = 10; j >= 0; --j) {
//				System.out.printf("%d\t", j);
//			}
//		}
	
		String  str = "";
		
		for (int i = 0; i <= 10; ++i) {
			str += "7";
		
			System.out.print(str + " ");
		}
		
		
	}

}
