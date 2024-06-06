public class Java0603 {

  void week(String s){
    switch (s) {
      case "월" :
        System.out.println("수업시작");
        break;
      case "화" :
        System.out.println("코테하기");
        break;
      case "수" :
        System.out.println("외식하기");
        break;
      case "목" :
        System.out.println("면접보기");
        break;
      case "금" :
        System.out.println("운동하기");
        break;
      case "토" :
        System.out.println("드라마보기");
        break;
      case "일" :
        System.out.println("데이트하기");
        break;
      default:
        System.out.println("알 수 없는 요일");
    }
  }

  void switch1(){
    char grade = 'A';
    String result = "";
    switch (grade){
      case 'A' :
        result = "Excellent";
        break;
      case 'B' :
        result = "Good";
        break;
      case 'C' :
        result = "Average";
        break;
      case 'D' :
        result = "Below Average";
        break;
      case 'F' :
        result = "Fail";
        break;
    }
    System.out.println(result);
  }

  void switch2(char operator, int num1, int num2){
    int result = 0;
    switch (operator){
      case '+':
        result = num1+num2;
        break;
      case '-':
        result = num1-num2;
        break;
      case '*':
        result = num1 * num2;
        break;
      case '/' :
        result = num1 / num2;
        break;
    }
    System.out.println(result);
  }

  void switch3(String color){
    String result = "";
    switch (color) {
      case "red" :
        result = "Apple";
        break;
      case "green" :
        result = "Grass";
        break;
      case "Sky" :
        result = "Sky";
        break;
    }
    System.out.println(result);
  }
  void switch4(int score){
    int m = score/10;
    switch (m){
      case 9 :
        System.out.println("A");
        break;
      case 8 :
        System.out.println("B");
        break;
      case 7 :
        System.out.println("C");
        break;
      case 6 :
        System.out.println("D");
        break;
      default:
        System.out.println("F");
    }
  }

  void switch5(String language){
    switch (language){
      case "Java" :
        System.out.println("Java는 객체지향언어로 JVM을 기반으로 합니다. 웹 개발에 주로 사용합니다.");
        break;
      case "Python" :
        System.out.println("파이썬은 데이터를 다루거나 AI 학습할 때 사용하기 좋은 언어입니다.");
        break;
      case "C++" :
        System.out.println("C++언어도 객체지향언어이며, 게임, 임베디드와 같은 저차원의 소프트웨어를 프로그래밍 할때 유리하다.");
        break;
      case "JavaScript" :
        System.out.println("JavaScript는 스트립트 언어로 클라이언트 단에서 웹페이지가 동작하는 것을 담당한다.");
        break;
    }
  }
  public static void main(String[] args) {

    Java0603 main = new Java0603();
    //main.week("월");
    //main.switch1();
    //main.switch2('+',3,2);
    //main.switch3("red");
    //main.switch4(44);
    main.switch5("Java");
  }
}


/*int score = 95;
    char grade = (score > 90) ? 'A' : ((score > 85) ? 'B' : 'C');

    System.out.println("당신의 학점은 : " + grade);*/

   /* int a = 5;
    int b = 3;

    if (a > b) {
      System.out.println("a is greater than b");
    } else if (a == b) {
      System.out.println("a and b are equal");
    } else {
      System.out.println("a is less than b");
    }*/



/*void quiz1(){
    int x = 10;
    String result = (x > 0) ? "양수입니다" : ((x == 0) ? "0입니다":"음수입니다");
    System.out.println("퀴즈1 : " + result);
  }

  void quiz2(){
    int score = 75;
    String result = "";
    if(score >= 90){
      result = "A";
    }
    else if(score >= 80){
      result = "B";
    }
    else if(score >= 70){
      result = "C";
    }
    else if(score >= 60){
      result = "D";
    }
    else {
      result = "F";
    }
    System.out.println("퀴즈2 : "+result);
  }

  void quiz3(){
    int year = 2023;
    String result = "";
    if(year%4 == 0 && (year % 100 != 0 || year % 400 == 0)){
      result = "윤년입니다";
    }
    else {
      result = "윤년이 아닙니다";
    }
    System.out.println("퀴즈3 : " + result);
  }

  void quiz4(){
    int a = 10;
    int b = 20;
    int c = 30;
    int result = a;
    if(result < b) {
      result = b;
    }
    if(result < c) {
      result = c;
    }
    System.out.println("퀴즈4 : " + result);
  }*/
/*  void quiz5(){
    int passScore = 60;
    int myScore = 70;
    String result = (myScore >= passScore) ? "합격" : "불합격";

    System.out.println("퀴즈5 : " + result);
  }

  void solve1(){
    int three = 3;
    int five = 5;
    int two = 2;
    boolean result = (five > three) || (five < two) && (five < three);
    System.out.println(result);
  }
  void solve2(){
    boolean x = true;
    boolean y = false;
    boolean z = true;

    if(x&&(!y)){
      System.out.println("조건 1 충족");
    }
    if(!(y^z)){
      System.out.println("조건 2 충족");
    }
    if(x||y||z){
      System.out.println("적어도 하나는 참");
    }
    if(!x&&!y&&!z){
      System.out.println("모두 거짓");
    }
  }*/


/*main.quiz1();
    main.quiz2();
    main.quiz3();
    main.quiz4();
    main.quiz5();


    main.solve1();
    main.solve2();*/