package gongboo;



public class FunctionTest {
	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 20;
		
		int sum = add(num1, num2);
		int sum2 = minus(num1, num2);
		int sum3 = mul(num1, num2);
		double sum4 = divi(num1, num2);
		System.out.printf("%d + %d = %d입니다\n", num1, num2, sum);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);
	}
	
	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}
	
	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}
	
	public static int mul(int a1, int a2) {
		int result = a1 * a2;
		return result;
	}
	
	public static double divi(int a1, int a2) {
		double result = a1 / a2;
		return result;
	}
	
	
}



