package mini;

import java.util.Random;
import java.util.Scanner;

public class A01 {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // 1부터 100까지의 랜덤 숫자 생성
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("1부터 100까지의 숫자를 맞춰보세요.");
        
        int guess;
        boolean correct = false;
        int attempts = 0;
        
        while (!correct) {
            System.out.print("추측한 숫자를 입력하세요: ");
            guess = scanner.nextInt();
            attempts++;
            
            if (guess == randomNumber) {
                System.out.println("정답입니다! " + attempts + "번 시도했습니다.");
                correct = true;
            } else if (guess < randomNumber) {
                System.out.println("추측한 숫자가 너무 작습니다. 다시 시도하세요.");
            } else {
                System.out.println("추측한 숫자가 너무 큽니다. 다시 시도하세요.");
            }
        }
        
        scanner.close();
    }
}