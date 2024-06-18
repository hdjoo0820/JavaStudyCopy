package quiz;

import java.util.Scanner;

public class B04_ScoreToGrade {

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
		System.out.println("국어 점수를 입력: ");
		int kor = sc.nextInt();
		System.out.println("영어 점수를 입력: ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력: ");
		int mat = sc.nextInt();
		
		int avg = (kor + eng + mat) / 3;
		
		
		if (avg < 0 || avg > 100){
			System.out.printf("0~100점 사이에 없는 과목이 있어서\n"
					+ "평균 점수: %d\n" + "등급: %c", 0, 'F');
		} else if (avg >= 90 && avg <= 100) {
			System.out.printf("평균 점수: %d점\n" + "등급: %c",
					avg, 'A');
		} else if (avg >= 80 && avg <= 89) {
			System.out.printf("평균 점수: %d점\n" + "등급: %c",
					avg, 'B');
		} else if (avg >= 70 && avg <= 79) {
			System.out.printf("평균 점수: %d점\n" + "등급: %c",
					avg, 'C');
		} else if (avg >= 60 && avg <= 69) {
			System.out.printf("평균 점수: %d점\n" + "등급: %c",
					avg, 'D');
		} else if (avg <= 59 && avg >= 0) {
			System.out.printf("평균 점수: %d점\n" + "등급: %c",
					avg, 'F');
		}
		
		
		
		
		
		
		
	}

}
