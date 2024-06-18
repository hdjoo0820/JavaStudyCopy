package mini;

public class Random {

	public static void main(String[] args) {
		for (int i = 0; i < 100000000; ++i) {			
			System.out.printf("%d번째 랜덤숫자:%d\n", i, (int)(Math.random() * 39) + 1);
		}	
	}
}
