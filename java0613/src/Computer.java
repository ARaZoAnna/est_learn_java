public class Computer extends Calculator {

  @Override
  double areaCircle(double r) {
    System.out.println("Computer 객체의 areaCircle메서드 실행");
    return Math.PI * r * r;
  }

  @Override
  void say() {
    System.out.println("새로운 문자열 출력");
  }
}
