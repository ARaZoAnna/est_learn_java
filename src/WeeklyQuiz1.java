import java.util.Scanner;

public class WeeklyQuiz1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int operation; //연산자
    int firstNum; //첫번째 피연산자
    int secondNum; //두번째 피연산자

    while (true){
      System.out.println("원하는 기능을 선택하세요");
      System.out.println("1. 덧셈 /2. 뺄셈 /3. 곱셈 /4. 나눗셈 /0. 종료");
      operation = scanner.nextInt();
      //연산자 입력이 올바르지 않을때
      if (operation < 0 || operation > 4){
        System.out.println("올바른 입력이 아닙니다");
        continue;
      }
      //종료할때
      if (operation == 0){
        return;
      }

      System.out.println("첫번째 값을 입력하고 엔터를 누르세요");
      firstNum = scanner.nextInt();

      System.out.println("두번째 값을 입력하고 엔터를 누르세요");
      secondNum = scanner.nextInt();

      //연산자에 따라 계산하기
      switch (operation) {
        case 1:
          System.out.println(String.format("%s + %s = %s", firstNum, secondNum, firstNum + secondNum));
          break;
        case 2:
          System.out.println(String.format("%s - %s = %s", firstNum, secondNum, firstNum - secondNum));
          break;
        case 3:
          System.out.println(String.format("%s x %s = %s", firstNum, secondNum, firstNum * secondNum));
          break;
        case 4:
          System.out.println(String.format("%s / %s = %s", firstNum, secondNum, firstNum / secondNum));
          break;
      }
    }

  }
}
