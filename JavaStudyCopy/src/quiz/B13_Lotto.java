package quiz;

import java.util.Arrays;

public class B13_Lotto {
	// 1 ~ 45 사이의 중복 없는 랜덤 숫자 7개를 생성하여 로또 당첨 번호를 만들어 보세요
	// 1. 숫자를 랜덤으로 뽑는다
	// 2. 뽑았으면 이전에 뽑았던 숫자중에 방금 뽑은 숫자가 없는지 확인한다
	// 3. 있으면 다시 뽑고 없으면 넘어간다

	// 1등 또는 2등에 담청될때까지 랜덤 로또 번호를 계속 생성하여
	// 몇 번만에 당첨되었는지 출력

	// - 로또 구매자는 번호를 6개 고른다
	// - 보너스 번호를 제외하고 모두 맞추면 1등
	// - 보너스 번호를 포함하여 모두 맞추면 2등

	public static void main(String[] args) {

		int currIndex = 0;
		int[] winNums = new int[7];

		while (currIndex < 7) {
			int num = (int) (Math.random() * 45 + 1);

			boolean repeated = false;
			for (int i = 0; i < currIndex; ++i) {
				if (winNums[i] == num) {
					// 이전에 뽑은 숫자 중에 중복되는 숫자가 있음
					repeated = true;
					break;
				}
			}
			// 중복된 숫자가 존재한다면 currIndex가 증가하지 않기 떄문에
			// 현재 인덱스에 숫자를 다시 뽑게 된다
			if (!repeated) {
				winNums[currIndex] = num;
				++currIndex;
			}

		}

		// 출력
//		for (int i = 0; i < winNums.length; ++i) {
//			System.out.print(winNums[i] + ", ");
//		}
//		System.out.println();
		
		int buyCount = 0;
		
		while (true) {
			++buyCount;
			
			int[] userNums = new int[6];
			currIndex = 0;
			while (currIndex < userNums.length) {
				int num = (int) (Math.random() * 45 + 1);				
				boolean repeated = false;
				for (int i = 0; i < currIndex; ++i) {
					if (userNums[i] == num) {
						repeated = true;
						break;
					}
				}
				if (!repeated) {
					userNums[currIndex] = num;
					++currIndex;
				}		
			}
			
//			System.out.printf("[%2d,%2d,%2d,%2d,%2d,%2d,%2d] Vs [%2d,%2d,%2d,%2d,%2d,%2d]",
//					winNums[0], winNums[1], winNums[2], winNums[3], winNums[4], winNums[5], winNums[6],
//					userNums[0], userNums[1], userNums[2], userNums[3], userNums[4], userNums[5]);
			
			// Array.toString(arr) 배열의 내용을 보기 좋게 문자열로 변환하는 함수
			System.out.printf("%s VS %s\n",
					Arrays.toString(winNums), Arrays.toString(userNums));
						
			// 당첨 체크
			// 일치하는 번호의 숫자가 6개면 1등 또는 2등 당첨
			// + 보너스 번호가 포함되어있으면 2등
			int winCount = 0;
			boolean hasBonus = false;
			for (int i = 0; i < userNums.length; ++i) {
				for (int j = 0; j < winNums.length; ++j) {
					if (userNums[i] == winNums[i]) {
						++winCount;
						
						if (j == 6) {
							hasBonus = true;
						}
						break;						
					}
				}
			}
			
			if (winCount == 6) {								
				System.out.print(buyCount + "회 구매만에 ");
				
				if (hasBonus) {
					System.out.println("2등 ㅊㅋㅊㅋ!!");
					break;
				} else {
					System.out.println("1등 ㅊㅋㅊㅋ!!");
					break;
				}
			}
		}
	}
}
