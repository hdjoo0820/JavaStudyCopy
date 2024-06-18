package quiz;

public class B11_WhileQuiz_T {
	/*
	1. 1000 ~ 2000 사이의  13의 배수를 모두 출력	

	2. 50 ~ 100 사이의 모든 숫자의 총합을 구해서 출력
	
	3. 1 ~ 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력
	
	4. 1 ~ 19 까지의 모든 숫자의 곱을 구해서 출력
	
	5. 8999에서 4999 사이에 있는 5번째 287의 배수를 출력
*/
	public static void main(String[] args) {
		// 1. 1000 ~ 2000 사이의  13의 배수를 모두 출력	
		int i = 1000;		
		while (i <= 2000) {
			if (i % 13 == 0) {
				System.out.println(i);							
			}
			++i;
		}		
		System.out.println();
		
		// 2. 50 ~ 100 사이의 모든 숫자의 총합을 구해서 출력
		i = 50;
		int sum = 0;
		while (i <= 100) {
			System.out.println(i);
			sum += i;
			++i;
		}
		System.out.println("총합: " + sum);
		
		// 3. 1 ~ 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력
		i = 1;
		int cnt = 0;
		while (i <= 1000) {
			if (i % 10 == 0) {
				System.out.println(i + "\t");
				
				if (++cnt % 8 == 0) {
					System.out.println();
				}
			}				
			++i;
		}
		System.out.println();
		
		// 4. 1 ~ 19 까지의 모든 숫자의 곱을 구해서 출력
		i = 1;
		long total = 1;
		while (i <= 19) {
			total *= i;
			++i;
		}
		System.out.println(total);
		System.out.println();
		// 5. 8999에서 4999 사이에 있는 5번째 287의 배수를 출력
		i = 8999;
		cnt = 0;
		while (i >= 4999) {
			if (i % 287 == 0 && ++cnt == 5) {
					System.out.println("5번쨰 287의 배수: " + i);
			}			
			--i;
		}
	}

}
