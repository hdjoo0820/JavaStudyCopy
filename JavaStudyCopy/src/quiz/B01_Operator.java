package quiz;

public class B01_Operator {

	public static void main(String[] args) {
		// 10.34567을 소수 3번째 자리에서 내림한 결과를 출력해보세요		
				//System.out.printf("%.3f", Math.floor(10.34567));
	
				// 강사 풀이
				double avg = 10.34567;
				
				// (1) 10.34567을 1034.567로 만든다 
				// (반올림, 올림, 내림 하고 싶은 숫자를 소수 첫번째 자리로 만든다)
				System.out.println(avg * 100);
				
				// (2) 반올림을 한다
				System.out.println(Math.floor(avg * 100));
				
				// (3) 아까 100을 곱했으니 다시 100.0으로 나눠서 원래대로 돌려준다
				System.out.println(Math.floor(avg * 100) / 100.0);
	}

}
