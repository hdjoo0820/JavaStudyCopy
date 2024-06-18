package quiz;

import java.util.Arrays;

public class D08_CountFruits {
	
	// 크기 1000의 String[]을 만들고 다음의 과일들을 무작위로 추가한 후
	// 해당 배열 내부에 각 과일이 몇 개씩 들어있는지 세어서 출력해주세요
	final public static String[] FRUITS = 
		{"Apple", "Banana", "Orange", "Mango", "Kiwi", "Pineapple",
				"Peach", "Watermelon", "Grape"};		
	public static void main(String[] args) {				
		String[] ranFru = new String[2222];
		
		while (true) {
			for (int i = 0; i < ranFru.length; ++i) {
				ranFru[i] = FRUITS[(int)(Math.random() * FRUITS.length)];			
			}
			System.out.println(Arrays.toString(ranFru));
					
			int appleCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Apple")) {
					++appleCnt;
				}
			}
			
			int bananaCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Banana")) {
					++bananaCnt;
				}
			}
			
			int orangeCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Orange")) {
					++orangeCnt;
				}
			}
			
			int mangoCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Mango")) {
					++mangoCnt;
				}
			}
			
			int kiwiCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Kiwi")) {
					++kiwiCnt;
				}
			}
			
			int pineappleCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Pineapple")) {
					++pineappleCnt;
				}
			}
			
			int peachCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Peach")) {
					++peachCnt;
				}
			}
			
			int watermelonCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Watermelon")) {
					++watermelonCnt;
				}
			}
			
			int grapeCnt = 0;
			for (int i = 0; i < ranFru.length; ++i) {
				if (ranFru[i].equals("Grape")) {
					++grapeCnt;
				}
			}
			
			int cntTotal = (appleCnt + bananaCnt + orangeCnt + mangoCnt + kiwiCnt
					+ pineappleCnt + peachCnt + watermelonCnt + grapeCnt);
						
			System.out.printf("Apple: %+9d개\nBanana: %+8d개\nOrange: %+8d개\n"
					+ "Mango: %+9d개\nKiwi: %+10d개\nPineapple: %+5d개\n"
					+ "Peach: %+9d개\nWaterMelon: %+d개\nGrape: %+9d개\n"
					+ "모든과일의개수: %d\n",
					appleCnt, bananaCnt, orangeCnt, mangoCnt, kiwiCnt,
					pineappleCnt, peachCnt, watermelonCnt, grapeCnt, cntTotal);	
			System.out.println();
		}
	}
}
