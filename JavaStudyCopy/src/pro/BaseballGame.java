package pro;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	int[] answer = new int[4];
	int chance = 9;
	
	public BaseballGame () {
		genAnswer();
	}
	
	// 실행하면 새로운 정답으로 초기화되는 메서드
	void genAnswer() {
		for (int i = 0; i < answer.length; ++i) {
			answer[i] = (int)(Math.random() * 10);
			
			for (int j = 0; j < i; ++j) {
				if (answer[i] == answer[j]) {
					--i;
					break;
				}
			}
		}	
	
	}
	
	public void printAnswer() {
		System.out.println("정답은 " + Arrays.toString(answer) + "입니다.");
	}

	public int[] guessNumber(int a, int b, int c, int d) {
		int[] result = {0, 0};
		
		for (int i = 0; i < answer.length; ++i) {
			if (answer[i] == a) {
				if (i == 0) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if (answer[i] == b) {
				if (i == 1) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if (answer[i] == c) {
				if (i == 2) {
					++result[0];
				} else {
					++result[1];
				}
			}
			
			if (answer[i] == d) {
				if (i == 3) {
					++result[0];
				} else {
					++result[1];
				}
			}
		}
		
		return result;
	}

	public void minusChance () {
		--this.chance;
	}
	
	public int getChance() {
		return this.chance;
	}

	public class BaseballGameResult {
		int strike;
		int ball;
		
		public BaseballGameResult(int strike, int ball) {
			this.strike = strike;
			this.ball = ball;
		}
		
		public int getStrike() {
			return strike;
		}
		
		public int getBall () {
			return ball;
		}
	}
	
	public static void main(String[] args) {
		boolean DEGUG_MODE = true;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			BaseballGame game = new BaseballGame();
			
			if (DEGUG_MODE) {
				game.printAnswer();
			}
			
			while (true) {
				System.out.print("숫자 4개를 입력 >> ");
				int a = sc.nextInt();
				int b = sc.nextInt();
				int c = sc.nextInt();
				int d = sc.nextInt();
				
				int[] result = game.guessNumber(a, b, c, d);
				
				game.minusChance();
				
				int chance = game.getChance();
				
				System.out.printf("%dstrike, %dball (남은기회: %d)\n",
						result[0], result[1], game.getChance());
				
				if (result[0] == 4) {
					System.out.println("플레이어의 승리입니다!");
					System.out.println("새로운 게임!");
					System.out.println("-------------------------------");
					break;
				} else if (chance == 0) {
					System.out.println("플레이어의 패배입니다...");
					System.out.println("다음 게임을 진행합니다...");
					System.out.println("-------------------------------");
					break;
					
				}
			}		
		}
	}

}