package myobj.academy;
// 웹 프로그래밍 반 학생들은 
// 국, 영, 수, c언어, 운영체제, 자료구조 점수가 있다
public class WepStudent extends AcademyStudent{
	static String[] subjectNames = {"국어", "영어", "수학", "C언어", "운영체제", "자료구조"};
	int[] scores = new int[6];

	public WepStudent() {
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = generateRandomScore();
		}
	}

	@Override
	public int getTotal() {
		int sum = 0;
		
		for (int i = 0; i < scores.length; ++i) {
			sum += scores[i];
		}
		return sum;
	}

	@Override
	public double getAvg() {
		// TODO Auto-generated method stub
		return getTotal() / (double)scores.length;
	}

	@Override
	public String getScores() {
		String str = "";
		
		for (int i = 0; i < scores.length; ++i) {
			str += String.format("%s: %d\n", subjectNames[i], scores[i]);
		}
		
		return str;
	}

}
