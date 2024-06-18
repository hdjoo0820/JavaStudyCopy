package quiz;

import java.util.Scanner;

public class B05_MonthToSeason_T {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("월을 입력(숫자): ");
		int mon = sc.nextInt();
		
		String seasonName;
		
		switch (mon) {
			default:
			seasonName = "없는 달";
			break;
			case 12: case 1: case 2: case 11:
				seasonName = "겨울";
				break;
			case 3: case 4:
				seasonName = "봄";
				break;
			case 5: case 6: case 7: case 8:
				seasonName = "여름";
				break;
			case 9: case 10:
				seasonName = "가을";
				break;
		}
		System.out.printf("%d월은 %s입니다.\n", mon, seasonName);
		
		if (mon == 3 || mon == 4) {
			seasonName = "봄";
		} else if (mon >= 5 && mon <= 8) {
			seasonName = "여름";
		} else if (mon == 9 || mon == 10) {
			seasonName = "가을";
		} else if (mon == 11 || mon == 12 || mon == 1 || mon == 2) {
			seasonName = "겨울";
		} else {
			seasonName = "없는 달";
		}
		System.out.printf("%d월은 %s입니다.\n", mon, seasonName);
		
		System.out.print("월을 입력(영어): ");
		String monName = sc.next();
				
		// "문자열".toLowerCase() : 어떤 문자열을 모두 소문자로 바꿔준다
		// monName = monName.toLowerCase();
		
		// 비교시 소문자 또는 대문자로 통일한 후에 빅하면
		// 대소문자 상관없이 비교가 가능하다
		switch (monName.toLowerCase()) {
		case "Sep": case "Oct":
			seasonName = "Fall";
			break;
		case "nov": case "dec": case "jan": case "feb":
			seasonName = "Winter";
			break;
		case "mar": case "apr":
			seasonName = "Spring";
		case "may": case "jun": case "jul": case "aug":
			seasonName = "Summer";
			break;
		default:
			seasonName = "Invalid month";
			break;		
				
		} 
		System.out.printf("%s is %s in korea.\n", monName.toUpperCase(), seasonName);
		
		// 문자열(뿐만 아니라 대문자로 시작하는 모든 타입들 ) 비교시에는 equals()
		if (monName.equals(monName)) {			
		}
	}
}
