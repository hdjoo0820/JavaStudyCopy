package quiz;

public class B08_ChangeCase {
	// 사용자가 영어로된 문장을 입력하면 대소문자를 반대로 바꿔서 출력해주는 프로그램 
	// +32 -32하면 대소문자

	public static void main(String[] args) {
		String text = "I Like To Try Apple";

		int len = text.length();
		
		// int diff = Math.abs('A' - 'a');
		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			
			if (ch >= 'a' && ch <= 'z') {
				System.out.print((char)(ch - 'a' + 'A'));
				// 				         'a' - 'a' + 'A'
				//System.out.print((char)(ch - diff));
			} else if (ch >= 'A' && ch <= 'Z') {
				System.out.println((char)(ch - 'A' + 'a'));
				//System.out.print((char)(ch + diff));
			} else
				System.out.print((char)ch);
		}
		
	
	}

}
