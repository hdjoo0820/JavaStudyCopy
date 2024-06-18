package quiz;

import java.util.ArrayList;
import java.util.List;

public class D01_ArrayListQuiz {
	/*
	  	1. 리스트에 1000 ~ 1999 사이의 랜덤 정수를 100개 추가하기
	  	
	  	2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	  	
	  	3. 원본에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
	 */
	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		
		for (int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1000 + 1000));
		}
		System.out.println(numbers);
		
		// 2. 원본에서 짝수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
		int i = 0;
		while (i < numbers.size()) {
			if (numbers.get(i) % 2 == 0) {
				numbers.remove(i);
				continue;
			}
			++i;
		}
		System.out.println(numbers);
		System.out.println("남은 개수: " + numbers.size());
		
		// 3. 원본에서 홀수를 모두 제거한 후 원본에 남아있는 값의 개수를 세기
		i = 0;
		while (i < numbers.size()) {
			if (numbers.get(i) % 2 == 1) {
				numbers.remove(i);
			} else {
				++i;
			}
		}
		System.out.println(numbers);
		System.out.println("남은 개수: " + numbers.size());
		
		// 리스트를 활용해 짝수 리스트와 홀수 리스트를 만들어 처리하기
		ArrayList<Integer> origin = new ArrayList<>();
		for (i = 0; i < 100; ++i) {
			origin.add((int)(Math.random() * 1000 + 1000));
		}
		
		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();	
		
		
		int len = origin.size();
		for (i = 0; i < len; ++i) {
			int value;
			switch ((value = origin.get(i)) % 2) {
				case 0:
					evenList.add(value);
					break;
				case 1:
					oddList.add(value);
					break;
			}
		}
		
		System.out.println("짝수 리스트: " + evenList);
		System.out.println("홀수 리스트: " + oddList);
	}
}
