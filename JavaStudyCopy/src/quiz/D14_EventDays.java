package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D14_EventDays {
	/*
	  	실행하면 오늘부터 앞으로 1년간의 이벤트 날짜를 모두 출력해주는 프로그램을 만들어주세요
	  	
	  	1 + 1 이벤트 : 매월 18일
	  	20% 할인 이벤트 : 홀수번째 주 금요일
	  	구매시 아메리카노 무료 이벤트 : 매주 화요일 
	  	
	  	※ 이벤트 날짜가 겹치는 날에는 모든 이벤트를 출력해줘야 한다
	*/
	public static void eventSchedule(
			int year, int month, int date, int eventDate) {
		Calendar cal = Calendar.getInstance();
		
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, date - 1);
		
		SimpleDateFormat dateFormat = 
				new SimpleDateFormat("yyyy-MM-dd(E)");
		int i = 0;
		while (i < eventDate) {
			cal.add(Calendar.DATE, 1);
			boolean is11 = true;
			boolean isame = true;
			boolean is20 = true;
			String dateStr = dateFormat.format(cal.getTime());
			int dayOfMon = cal.get(Calendar.DAY_OF_MONTH);
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			int weekOfMon = cal.get(Calendar.WEEK_OF_MONTH);
			if (dayOfMon == (Calendar.DAY_OF_MONTH) + 13) {
				System.out.printf("%s는 1 + 1 이벤트 날입니다.\n", dateStr);
				is11 = false;
			} else if (dayOfWeek == (Calendar.DAY_OF_WEEK) - 1) {
				System.out.printf("%s는 상품구매시 아메 무료 증정 날입니다.\n", dateStr);
				isame = false;
			} else if (weekOfMon == (Calendar.WEEK_OF_MONTH) % 1) {
				if (dayOfWeek == (Calendar.DAY_OF_WEEK) - 2) {
					System.out.printf("%s는 20%할인 날입니다.\n", dateStr);
					is20 = false;
				}
			
			} else if (!(is11 == isame)) {
				System.out.printf("%s는 1 + 1이벤트와 "
						+ "상품구매시 아메 무료증정 이벤트 날입니다.\n", dateStr);
			}
	
			System.out.printf("%s는 이벤트가 없는 날입니다.\n", dateStr);
			++i;
		}
	}
	
	public static void main(String[] args) {
		int year = 2024;
		int month = 5;
		int date = 27;
		int eventDate = 365;
		
		eventSchedule(year, month, date, eventDate);
	}
}
