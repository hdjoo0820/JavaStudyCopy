import java.util.Arrays;
import myobj.Book;

public class C05_ReferencesType {

   /*
    *  # 기본형 데이터 타입
    *  
    * - int , float, short, double, byte, long .. 등
    *   소문자로 시작하는 타입들을 기본형 타입이라고 부른다.
    * - 기본형 데이터 타입 변수에는 실제 값이 저장된다.
    * - 기본형 데이터 타입에는 .을 찍어 사용할 수없다.
    * - .을 찍는 것은 가리키는 대상이 있을때
    *  
    *  # 참조형 데이터 타입
    *  
    *  - String
    *  - 배열
    *  - 그외 모든 클래스들 
    *  - 참조형 데이터 타입 변수에는 원본을 가리키는 주소값이 저장된다.
    *  - 참조형 변수에는 .을 찍고 변수에 저장된 주소를 참조할 수 있다.
    *  
    */
   
   //기본형 타입 매개변수의 경우
   public static void primitiveType(int num) {
      num = 123;
   }
   // 참조형 타입 배열의 경우
   public static void referencesType1(double[] arr) {
      if (arr != null && arr.length !=0) {
         arr[0] = 99.999;
      }
   }
   
   // 내가 만든 클래스인 경우
   public static void referencesType2(Book book) { //클래스
      book.page = 121;
   }
   
   public static void referencesType3(String str) {
      str = "Babo";
   }
   
   
   public static void main(String[] args) { //우선 순위
      
      
      int a = 10;
      primitiveType(a);
      System.out.println(a);
      System.out.println("기본형 Bfore :" + a);
      double[] b = new double[4];
      
      b[0] = 10.123;
      b[1] = 11.3;
      b[2] = 9.3;
      
      referencesType1(b);
      System.out.println(Arrays.toString(b));
   }

}