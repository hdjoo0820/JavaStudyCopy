package quiz;
import java.util.Scanner;
public class B03_Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("이름, 가로 ,세로 입력..");
//		String str = sc.next();
//		String str1 = "직사각형의 넓이는";
//		double length = sc.nextDouble();
//		double width  = sc.nextDouble();
//		double rectangle = (length*width);
//		boolean a = (rectangle > 100 && rectangle < 500);
//		System.out.printf("\%d\n \n%d\n %f\n %s\n"
//				+ str + str1
//				+ Math.round(rectangle*100)/100.0
//				+ a);
		System.out.print("이름 입력: ");				
		String name = sc.next();
		System.out.print("가로 입력: ");
		double width = sc.nextDouble();
		System.out.print("세로 입력: ");
		double height = sc.nextDouble();
		double area = Math.round(width * height * 100) / 100.0;
		boolean a = (area > 100 && area < 500);
		System.out.println(area);
		System.out.printf("\"%s\" 직사각형의 넓이는 %.2f\n %s", name, area, a);	
	}
}
