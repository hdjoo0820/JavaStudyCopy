package quiz;

import java.util.Scanner;

public class B12_UpDownGame_T {
	/*
	# Updown 게임을 만드시오
	
	1. 게임이 시작되면 1 ~ 100 사이의 랜덤숫자가 정답이 된다
	2. 사용자가 숫자를 입력하면 Up인지 Down인지 알려준다
	3. 만약 사용자가 현재 추측 범위를 벗어나는 숫자를 입력했다면
	   기회를 소진하지 않고 다시 입력할 수 있는 기회를 준다
	   
	   ex> 50
	   	   Down! (남은기회 4회)
	   	   75
	   	   추측 범위를 벗어난 숫자입니다.. (남은 기회 4회)
	4. 6번안에 못맞추면 정답이 뭐였는지 알려주고 프로그램 종료
	5. 사용자가 정답을 맞추면 축하한다고 해주고 프로그램 종료
*/
	public static void main(String[] args) {
		boolean DEBUG_MODE = true;
		
		Scanner sc = new Scanner(System.in);
		
		int answer = (int)(Math.random() * 100) + 1;
		int userTry = 0;
		int USER_MAX_TRY = 6;
		if (DEBUG_MODE) {
			System.out.println("* 정답은 " + answer + "입니다.");
		}
		
		int userGuess;
		int currMax = 101;
		int currMin = 0;
		
		while (true) {
			if (userTry == 6) {
				System.out.printf("모든 기회를 사용하셨습니다... 정답은 %d이었습니다.\n", answer);
				break;
			}
			
			System.out.print(">> ");
			userGuess = sc.nextInt();  
			
			if (userGuess >= currMax || userGuess <= currMin) {
				System.out.printf("추측 범위를 벗어난 숫자입니다...\n"
						+ "현재 추측 범위는 %d초과 %d미만입니다.(남은기회:%d)\n", 
						currMin, currMax, USER_MAX_TRY - userTry);
				continue;
			}
			
			++userTry;
			
			if (userGuess == answer) {
				System.out.println(userTry + "회 만에 정답! ㅊㅋㅊㅋ");
				break;
			} else if (userGuess < answer) {
				System.out.printf("UP! (남은기회:%d)\n", USER_MAX_TRY - userTry);
				currMin = userGuess;
			} else if (userGuess > answer) {
				System.out.printf("DOWN! (남은기회:%d)\n", USER_MAX_TRY - userTry);
				currMax = userGuess;
			}
			
		}

	}

}
