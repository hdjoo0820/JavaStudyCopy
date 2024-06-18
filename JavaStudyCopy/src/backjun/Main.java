package backjun;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(">>");
		Long a = sc.nextLong();
		String b = sc.next();
		int total = 0;
		for (int i = 0; i < a ; ++i) {			
			char c = b.charAt(i);
			int d = c - '0';
			total += d;
		}
		System.out.println(total);
	}	
}