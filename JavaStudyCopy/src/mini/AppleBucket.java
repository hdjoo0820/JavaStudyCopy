package mini;
import java.util.Scanner;
public class AppleBucket {

	public static void main(String[] args) {
	/*
		사과를 10개씩 담을 수 있는 바구니가 있을 때.
		사용자가 사과의 개수를 입력하면 사과를 모두 담기 위해 필요한
		바구니의 개수를 알려주는 프로그램을 만들어보세요.		
	*/
		Scanner sc = new Scanner(System.in);
		int bucketSize = 10;
		int appleQty;
		int bucketQty;
		System.out.println("바구니의 개수: " + bucketSize);
		System.out.print("사과의 개수를 입력하시오");
		appleQty = sc.nextInt();
		
		if (appleQty < 0) {
			bucketQty = -1;
		} else if (appleQty % bucketSize > 0) {
			bucketQty = appleQty / bucketSize + 1;
		} else {
			bucketQty = appleQty / bucketSize;
		}
		
		if (bucketQty != -1) {
			System.out.printf("사과 %d개를 바구니에 담기위해 필요한 바구니의 개수는"
					+ " %d개입니다.", appleQty, bucketQty);
		} else {
			System.out.println("시스템 오류");
		}
		
		
		
		
		
		
		
		
		
	}
}
