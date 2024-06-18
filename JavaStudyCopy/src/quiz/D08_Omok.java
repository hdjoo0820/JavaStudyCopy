package quiz;

import java.util.Arrays;
import java.util.Scanner;

import myobj.omok.Omok;

public class D08_Omok {

	public static void main(String[] args) {	
		Omok omok = new Omok();
		
		omok.putBlack(3, 7);
		omok.putBlack(4, 6);
		omok.putBlack(5, 5);
		omok.putBlack(6, 4);
		omok.putBlack(7, 3);
		
		
		System.out.println(omok.postCheck(7, 7, Omok.BLACK_STONE));
		
		omok.printBoard(); 	
	}
}
