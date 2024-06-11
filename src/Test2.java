public class Test2 {
  public static void main(String[] args) {
    /*Test3 test3 = new Test3();
    System.out.println(test3.good());*/
/*
    System.out.println(args[0]);

    //static 은 인스턴스를 만들지 않아도 된다.
    //static은 메모리에 항상 존재, 즉 메모리 공간을 차지.
    Test3.call();
    Test3 test3 = new Test3();*/

    Test3 test3 = new Test3();
    System.out.println(test3.plus(3,4));
    int result = test3.minus(5,5);
    System.out.println(result);
  }
}
