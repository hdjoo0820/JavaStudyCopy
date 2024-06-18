package quiz;

public class B14_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] myArr = {
				{1, 1, 1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1},
				{1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
				{1, 1, 1, 1},
		};
		
		// 1. myArr의 모든 값을 100 ~ 200 사이의 랜덤 정수로 바꾸기
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int)(Math.random() * 101 + 100);
			}
		}
		// 2. 랜덤으로 바뀐 모든 값을 총합과 평균을 구하기
		int total = 0;
		double avg = 0;
		for (int i = 0, cnt1 = 0; i < myArr.length; ++i) {
			++cnt1;
			for (int j = 0, cnt2 = 0; j < myArr[i].length; ++j) {
				++cnt2;
				total += myArr[i][j];
				avg = total / (cnt1 + cnt2);
			}
		}
		System.out.printf("총합: %d\t평균: %.2f\n", total, avg);
		// 3. 각 행(row)의 합을 구해서 출력하기 가로의 총합
		int[] rowSum = new int[myArr.length];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j =0; j < myArr[i].length; ++j) {
				rowSum[i] += myArr[i][j];
			}
		}
		
		for (int i = 0; i < rowSum.length; ++i) {
			System.out.printf("%d행의 합: %d\n", i, rowSum[i]);
		}
		// 4. 각 열(col)의 합을 구해서 출력하기 세로의 총합
		int maxColumSize = 0;
		
		for (int i = 0; i < myArr.length; ++i) {
			maxColumSize = maxColumSize < myArr[i].length ? myArr[i].length : maxColumSize;
		}
		
		// 열의 합의 개수는 가장 열이 많은 행의 길이가 된다
		int[] colSum = new int[maxColumSize];
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				colSum[j] += myArr[i][j];
			}
		}
		
		for (int i = 0; i < colSum.length; ++i) {
			System.out.printf("%d열의 합: %d\n", i, colSum[i]);
		}
		
		for (int i = 0; i < myArr.length; ++i) {
			for (int j = 0; j < myArr[i].length; ++j) {
				System.out.printf("%03d, ", myArr[i][j]);
			}
			System.out.println("}");
		}

	}

}