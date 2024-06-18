package quiz;

public class B11_WhileQuiz {
/*
	1. 1000 ~ 2000 사이의  13의 배수를 모두 출력	

	2. 50 ~ 100 사이의 모든 숫자의 총합을 구해서 출력
	
	3. 1 ~ 1000 사이의 모든 10의 배수를 한 줄에 8개씩 출력
	
	4. 1 ~ 19 까지의 모든 숫자의 곱을 구해서 출력
	
	5. 8999에서 4999 사이에 있는 5번째 287의 배수를 출력
*/
	public static void main(String[] args) {
		int a = 1000;
		while (a++ <= 2000) {
			if (a % 13 == 0) {			
				System.out.printf("%-5d", a);
			}
		}
		System.out.println();
		int total = 0;
		int b = 50;
		while (b++ <= 100) {
			total += b;	
			System.out.println("총합은 " + total);
		}
		int cnt = 0;
		int c = 1;
		while (c++ <= 1000) {
			if(c % 10 == 0) {
				++cnt;
				System.out.printf("%d\t", c);
				if (cnt % 8 == 0) {
				System.out.println();
				}
			}
		
		}
		long total1 = 1;
		int d = 1;
		while (d++ <= 19) {
			total1 *= d;
			System.out.println(total1);
		}
		int cnt1 = 0;
		int e = 8999;
		while (e-- >= 4999) {
			if (e % 287 == 0) {
				++cnt1;
				if (cnt1 == 5) {
					System.out.println(e);
				}
			}
		}

	}

}
