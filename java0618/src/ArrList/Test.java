package ArrList;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public static void main(String[] args) {
    List<String> arrayList = new ArrayList<String>();
    arrayList.add("Java");
    arrayList.add("Spring");
    arrayList.add("Servlet/JSP");
    arrayList.add("DBMS");
    arrayList.add("JPA");

    System.out.println("총 객체수 : " + arrayList.size());

    System.out.println("=====================");

    System.out.println("두번째인덱스" + arrayList.get(2));

    for (String str : arrayList) {
      System.out.println(str);
    }
    System.out.println(arrayList.contains("java"));

    // null 값도 값이다.
    List<Object> objects = new ArrayList<Object>();
    System.out.println(objects.isEmpty());
    // 값을 모두 지운다
    objects.clear();
    System.out.println(objects.isEmpty());
  }
}
