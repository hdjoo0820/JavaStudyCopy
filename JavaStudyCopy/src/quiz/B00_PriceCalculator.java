package quiz;

import java.util.Scanner;

public class B00_PriceCalculator {
	/*
	 * 음료수 개수를 입력하면 총 가격을 출력해보세요 (각 음료수의 가격은 2300, 2800, 3300, 3500 입니다.)
	 *  ex> 0 5 0 1 = 15000
	 */
	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.print("각 음료수의 개수를 입력하세요 >> ");
	int a = sc.nextInt(); 
	int drk1 = a*2300;
	int b = sc.nextInt();
	int drk2 = b*2800;
	int c = sc.nextInt();
	int drk3 = c*3300;
	int d = sc.nextInt();
	int drk4 = d*3500;
	int drk_price = drk1+drk2+drk3+drk4;
	System.out.printf("음료수의 총가격은 (%d원)입니다", drk_price);
	}

}
