import java.util.Scanner;

public class Divide {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();

    divide(a,b);
  }

  public static void divide(int a, int b) throws ArithmeticException {
    try {
      int result = a / b;
      System.out.println("나눗셈의 결과: " + result);
    } catch (ArithmeticException e) {
      System.out.println("0으로 나눌 수 없어요");
    }
  }
}
