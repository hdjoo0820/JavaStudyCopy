package quiz;

public class D09_isPhoneNumber_T {
	/*
  		전달받은 문자열이 올바른 핸드폰 번호인지 검사하는 메서드를 만들어보세요
	 */
	
	public static boolean isValidPhoneNumber(String phoneNumer) {
		phoneNumer = phoneNumer.trim();
		
		// 숫자와 -만으로 이루어진 문자열인가
		int len = phoneNumer.length();
		for (int i = 0; i < len; ++i) {
			char ch = phoneNumer.charAt(i);
			
			if (ch != '-' && (ch < '0' || ch > '9')) {
				System.out.println("[System] '-' 또는 숫자가 포함되어 있습니다.");
				return false;
			}
		}
				
		// -1가 포함된 번호인 경우 길이가 13이어야 하고 -의 위치도 검사해야 한다
		if (phoneNumer.contains("-")) {
			if (phoneNumer.length() != 13) {
				System.out.println("[System] 번호의 길이가 잘못되었습니다.");
				return false;				
			} else if (phoneNumer.indexOf('-') != 3 ||
					phoneNumer.lastIndexOf('-') != 8) {
				System.out.println("[System] -의 길이가 잘못되었습니다.");
				return false;
			}
		}
		
		// 모든 -를 제거한 후의 길이가 11인가
		phoneNumer = phoneNumer.replace("-", "");
		
		if (phoneNumer.length() != 11) {
			System.out.println("[System] 숫자의 개수가 잘못되었습니다.");
			return false;
		}
		
		// 010으로 시작하는가
		if (!phoneNumer.startsWith("010")) {
			System.out.println("[System] 번호가 010으로 시작하지 않습니다");
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String ph = "010-1234-1234";
		System.out.println(isValidPhoneNumber(ph));		
	}
	
}
