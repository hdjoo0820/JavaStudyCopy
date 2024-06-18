package quiz;

public class B07_ForQuiz_T {
	/*
		1. 1000 ~ 2000 사이의  13의 배수를 모두 출력	

		2. 50 ~ 100 사이의 모든 숫자의 총합을 구해서 출력
		
		3. 1 ~ 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력
		
		4. 1 ~ 19 까지의 모든 숫자의 곱을 구해서 출력
		
		5. 8999에서 4999 사이에 있는 5번째 287의 배수를 출력
	*/
	public static void main(String[] args) {

		for(int i = 1000; i <= 2000; ++i) {
			if (i % 13 == 0) {
				System.out.printf("13의 배수: %d\n", i);				
			}
		}
	
		// 총합을 누적시키기 위한 변수를 하나 생성하고 계속 누적시킨다
		long total = 0;
		
		for (int i = 50; i <= 100; ++i) {
			total += i;
		}
		System.out.println("총합은 " + total);
				
		for (int i = 1, printCount = 0; i <= 1000; ++i) {
			if (i % 10 == 0) {
				System.out.printf("%6d", i);
				++printCount; // 10의 배수를 출력한 횟수를 센다
				
				if (printCount % 8 == 0) {
					System.out.println();
				}
			}
		}	
		//		for (int i = 10; i <= 1000; i += 10) {
//			System.out.printf("%6d", i);
//			
//			if (i % 80 == 0) {
//				System.out.println();
//			}
//		}		
	//	4. 1 ~ 19 까지의 모든 숫자의 곱을 구해서 출력
		
		long total2 = 1;
		
		for (int i = 1; i <=19; ++i) {
			System.out.printf("%d x %d = %d\n",
					total2, i, total *= i);
		}	
		//		long total2 = 1;
//		for (int i = 1; i <=19; ++i) {
//			total2 *= i;
//		}
//		System.out.println();
//		System.out.println("총합은 " + total2);
//	
	//	5. 8999에서 4999 사이에 있는 5번째 287의 배수를 출력
		
		for (int i = 8999, cnt = 0; i >= 4999; --i) {
			if (i % 287 == 0) {
				++cnt;
				
				if(cnt == 5) {
					System.out.printf("[%d번째 287의 배수: %d]\n", cnt, i);
				} else {
					System.out.printf("%d번째 287의 배수: %d\n", cnt, i);				
				}
			}
		}	
//		for (int i = 8999, count = 0; i >= 4999; --i) {
//			if (i % 287 == 0){				
//				++count;
//				
//				if(count == 5) {
//					System.out.println("\n5번째 287의 배수:" + i);
//				}
//			}
//		}
//			
	}

}
