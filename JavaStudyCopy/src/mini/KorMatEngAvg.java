package mini;

import java.util.Scanner;

public class KorMatEngAvg {
	/*
	국어, 영어, 수학 점수를 차례대로 입력받아 평균 점수를 구한 후에
	평균 점수와 등급을 출력해주는 프로그램
	(각 과목의 유효 점수는 0 ~ 100점 이고,
	 유효하지 않은 점수가 하나라도 있다면 평균 점수는 0점, 등급은 F로 나와야한다)
	
	1. 평균점수 90점 이상 A
	   평균점수 80점 이상 B
	   평균점수 70점 이상 C
	   평균점수 60점 이상 D
	   그 외 F
	  */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력..");
		int kor = sc.nextInt();
		System.out.println("영어 점수 입력..");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력..");
		int mat = sc.nextInt();
		double avg; char a;
		avg = (kor + eng + mat) / 3.0;
		boolean error = false;
		
		if (kor < 0 || kor > 100) {
			error = true;
		} 
		if (eng < 0 || eng > 100) {
			error = true;
		} 
		if (mat < 0 || mat > 100) {
			error = true;
		}
		if (error) {
			System.out.println("평균점수 :0, 등급 :F");
		} else if (avg >= 90) {
			a = 'A';
			System.out.printf("평균점수 :%.2f, 등급 :%c", avg, a);
		} else if (avg >= 80) {
			a = 'B';
			System.out.printf("평균점수 :%.2f, 등급 :%c", avg, a);
		} else if (avg >= 70) {
			a = 'C';
			System.out.printf("평균점수 :%.2f, 등급 :%c", avg, a);
		} else if (avg >= 60) {
			a = 'D';
			System.out.printf("평균점수 :%.2f, 등급 :%c", avg, a);
		} else 
			System.out.printf("평균점수 :%.2f, 등급 :F", avg);
	}

}
