package mini;
import java.util.Arrays;
import java.util.Random;

public class A02 {
    public static void main(String[] args) {
        int[] lottoNumbers = generateLottoNumbers();
        System.out.println("로또 번호: " + Arrays.toString(lottoNumbers));
    }
    
    public static int[] generateLottoNumbers() {
        int[] numbers = new int[6];
        Random random = new Random();
        
        for (int i = 0; i < 6; i++) {
            int randomNumber;
            boolean isDuplicate;
            
            do {
                randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 난수 생성
                isDuplicate = false;
                
                // 생성된 난수가 배열에 이미 존재하는지 확인
                for (int j = 0; j < i; j++) {
                    if (numbers[j] == randomNumber) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate);
            
            numbers[i] = randomNumber;
        }
        
        // 생성된 번호 정렬
        Arrays.sort(numbers);
        
        return numbers;
    }
}