package quiz;
import java.util.Scanner;
public class B00_AgeCalculator {
	/*
	  	  이름과 태어난 년도를 입력하면 이름과 나이를 출력해주는 프로그램을 만들어보세요
	  	  
	  	  ex> 김동우 1997	  
	  	  김동우(28세)
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력 > ");
		String name = sc.nextLine();
		System.out.print("태어난 년도 > ");
		int age = sc.nextInt();
		age = (2025-age);
		
		System.out.println(name + "(" + age + "세)");		
	}
}
