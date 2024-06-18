package quiz;

import java.util.Scanner;

public class B05_MonthToSeason {

	/*
		사용자로부터 몇월인지 입력받으면 해당하는 계절을 출력해보세요
		(switch-case문, if문으로 한번씩)
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("몇 월인지 입력...");
		int mon = sc.nextInt();
		String mon1 = sc.next();
		switch (mon){
			case 3:
			case 4:
			case 5:
				System.out.printf("%d월은 봄입니다", mon);
				break;
			case 6:
			case 7:
			case 8:
				System.out.printf("%d월은 여름입니다", mon);
				break;
			case 9:
			case 10:
			case 11:
				System.out.printf("%d월은 가을입니다", mon);
				break;
			case 12:
			case  1:
			case  2:
				System.out.printf("%d월은 겨울입니다", mon);	
				break;
		}
	
			if  (mon == 12 || mon <=2){
				System.out.println(mon + "월은 겨울입니다");
			} else if (mon >= 3 && mon <= 5) {
				System.out.println(mon + "월은 봄입니다");
			} else if (mon >= 6 && mon <= 8) {
				System.out.println(mon + "월은 여름입니다");
			} else 
				System.out.println(mon + "월은 가을입니다");
		
		switch (mon1) {
			case "Decenber":
			case "Dec":
			case "Jan":
			case "January":
			case "February":
			case "Feb":
				System.out.printf("%s은 겨울입니다", mon1);
				break;
			case "March":
			case "Mar":
			case "April":
			case "Apr":
			case "May":
				System.out.printf("%s은 봄입니다", mon1);
				break;
			case "June":
			case "Jun":
			case "July":
			case "Jul":
			case "August":
			case "Aug":
				System.out.printf("%s은 겨울입니다", mon1);
				break;
			case "September":
			case "Sep":
			case "October":
			case "Oct":
			case "November":
			case "Nov":
				System.out.printf("%s은 겨울입니다", mon1);
				break;
		}
		
		
		
		
		
		
	}

}
