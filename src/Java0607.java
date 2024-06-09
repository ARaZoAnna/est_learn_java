import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Java0607 {
  public static void main(String[] args) {
    Random random = new Random();
    List<Integer> list = new ArrayList<>();
    Integer tmp = random.nextInt(45)+1;
    list.add(tmp);

    while(list.size()<6){
      tmp = random.nextInt(45)+1;
      if(list.contains(tmp)){
        continue;
      }
      list.add(tmp);
    }
    // 출력
    System.out.print("로또 번호: ");
    for(int num : list){
      System.out.print(num + " ");
    }
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
    System.out.println("총 결제 금액 : " + 10000*people + "원");*/

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


/*Scanner scanner = new Scanner(System.in);
    //사용자로부터 학생 수를 입력받는다
    System.out.print("학생 수를 입력하세요 : ");
    int num = scanner.nextInt();
    String studentName;

    int koreaScore; int englishScore; int mathScore;
    int sum; double average; String level; //총점, 평균, 등급

    //학생 수 만큼 정보를 입력받는다
    for(int i = 0; i < num; i++){
      System.out.print("학생 이름 : ");
      scanner.nextLine(); //개행문자제거
      studentName = scanner.nextLine();
      //scanner.nextLine(); //개행문자제거
      //System.out.println(studentName);
      System.out.print("국어 점수 : ");
      koreaScore = scanner.nextInt();
      //scanner.nextLine(); //개행문자제거
      System.out.print("영어 점수 : ");
      englishScore = scanner.nextInt();
      System.out.print("수학 점수 : ");
      mathScore = scanner.nextInt();

      // 학생의 총점 평균 등급을 계산한다.
      sum = koreaScore + englishScore + mathScore;
      //평균은 소수점 둘째자리까지 출력합니다.
      average = sum / 3.0;
      String aver = String.format("%.2f",average);
      //등급구하기
      switch ((int)average/10){
        case 9 :
          level = "A";
          break;
        case 8 :
          level = "B";
          break;
        case 7 :
          level = "C";
          break;
        case 6 :
          level = "D";
          break;
        default:
          level = "F";
      }


      System.out.println("=====학생 성적 정보=====");
      System.out.println("이름: " + studentName);
      System.out.println("국어 점수: " + koreaScore);
      System.out.println("영어 점수: " + englishScore);
      System.out.println("수학 점수: " + mathScore);
      System.out.println("총점: " + sum);
      System.out.println("평균: " + aver);//String.format("%0.2f",average));
      //System.out.println("%.2f", average);
      System.out.println("등급: " + level);
      System.out.println("=======================");
    }*/