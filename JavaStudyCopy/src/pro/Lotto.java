package pro;

import java.util.Arrays;

public class Lotto {
	public static void main(String[] args) {
	      
	      int[] winNums = new int[7];
	      int currIndex = 0;
	      
	      while (currIndex < 7) {
	         int num = (int)(Math.random() * 45 + 1);
	         

	         boolean repeated = false; 
	         for (int i = 0; i < currIndex; ++i) {
	            if (winNums[i] == num) {
	               repeated = true;
	               break;
	            }
	         }
	        
	         if (!repeated) {
	            winNums[currIndex] = num;         
	            ++currIndex;
	         }
	      }
	      
	      int buyCount = 0;
	      
	      while (true) {
	         ++buyCount;
	         
	         int[] userNums = new int[6];
	         currIndex = 0;
	         while (currIndex < userNums.length) {
	            int num = (int)(Math.random() * 45 + 1);            
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
	         
	         int winCount = 0;
	         boolean hasBonus = false;
	         for (int i = 0; i < userNums.length; ++i) {
	            for (int j = 0; j < winNums.length; ++j) {
	               if (userNums[i] == winNums[j]) {
	                  ++winCount;                  
	                  if (j == 6) {
	                     hasBonus = true;
	                  }                  
	                  break;
	               }
	            }
	         }
	         
	         if (winCount == 6) {
	            System.out.printf("%s Vs %s\n",
	            		Arrays.toString(winNums), Arrays.toString(userNums));
	            
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