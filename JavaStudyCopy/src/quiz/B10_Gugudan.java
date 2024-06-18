package quiz;
	/*
		1. 구구단을 다음과 같이 가로로 출력 2단: 2x1=2 2x2=4 2x3=6
		2. 구구단을 다음과 같이 세로로 출력 2단 	3단 
									2x1=2   3x1=3
	*/
public class B10_Gugudan {

	public static void main(String[] args) {
		for (int dan = 2; dan <= 9; ++dan) {;
			System.out.print(dan + "단: ");
			for (int gop = 1; gop <= 9; ++gop) {
			System.out.printf("%dx%d=%-2d ", dan, gop, dan * gop);
			}
			System.out.println();
		}		
		
		for (int gop = 0; gop <= 9; ++gop) {
			for (int dan = 2; dan <= 9; ++dan) {
				if (gop == 0) {
					System.out.print(dan + "단\t\t");
				} else {
					System.out.printf("%d x %d= %-2d\t", dan, gop, dan * gop);					
				}
			}
			System.out.println();
		}
	
	}
}
