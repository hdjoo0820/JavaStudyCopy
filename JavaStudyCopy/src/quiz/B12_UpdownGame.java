package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_UpdownGame {
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
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		int userNum = sc.nextInt();
		boolean range = true;		
		int ranNum = ran.nextInt(100) + 1;
		if (userNum > 0 && userNum < 100) {
			range = false;
		}
		for (int chance = 6; chance > 0; --chance) {
			System.out.print("번호 입력: ");			
			userNum = sc.nextInt(); 
			System.out.println();
			if (ranNum > userNum) {				
				System.out.printf("%d : 랜덤번호보다 작습니다 기회는 %d번 남음\n",userNum, chance);
			} else if (ranNum < userNum) {
				System.out.printf("%d : 랜덤번호보다 큽니다 기회는 %d번 남음\n",userNum, chance);;
			} else if (ranNum == userNum) {
				System.out.printf("%d는 랜덤번호와 같아서 정답", userNum);
				break;
			} else {
				System.out.print("기회를 모두 소진해서 랜덤번호 공개" + ranNum);
			}
			if (!range) {
				System.out.println("입력 숫자가 랜덤번호 사이에 없습니다");
			}
		}	
		
	
	}

}
