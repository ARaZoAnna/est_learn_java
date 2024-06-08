import java.util.Scanner;
import java.util.Random;

public class Java0607 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("영화 제목을 입력하세요 : ");
    String movieName = scanner.nextLine();
    System.out.print("관람 인원을 입력하세요 : ");
    int people = scanner.nextInt();
    scanner.nextLine(); //개행 문자 제거
    System.out.print("예매자의 이름을 입력하세요 : ");
    String name = scanner.nextLine();
    System.out.print("전화번호를 입력하세요 : ");
    String phoneNum = scanner.nextLine();

    System.out.println("========================");
    System.out.println("영화 제목 : " + movieName);
    System.out.println("관람 인원 : " + people + "명");
    System.out.println("예매자 이름 : " + name);
    System.out.println("예매자 전화번호 : " + phoneNum);
    System.out.println("총 결제 금액 : " + 10000*people + "원");
  }
}

/* Scanner scanner = new Scanner(System.in);

System.out.println("1~4 사이의 정수를 입력하세요");
int num = scanner.nextInt();
String result = "";
switch (num) {
  case 1:
    result = "봄";
    break;
  case 2:
    result = "여름";
    break;
  case 3:
    result = "가을";
    break;
  case 4:
    result = "겨울";
    break;
  default:
    result = "잘못된 입력입니다!";
}
System.out.println(result);*/


/*Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int target = random.nextInt(100) + 1;
    int input = 0;
    while (true) {
      System.out.println("1~100 사이의 정수를 입력하세요 : ");
      input = scanner.nextInt();

      if (target > input) {
        System.out.println("down");
        continue;
      } else if (target < input) {
        System.out.println("up");
        continue;
      }
      if (target == input) {
        System.out.println("정답입니다!");
        break;
      }
    }*/