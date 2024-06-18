package exam;

import java.util.ArrayList;
import java.util.List;

public class test {

  public static void main(String[] args) {
    // <>이거 컬렉션이다.
    List<String> arrayList = new ArrayList<>();
    arrayList.add("홍길동");
    arrayList.add(1, "홍길동2");
    arrayList.add("홍길동");
    arrayList.add("홍길동");
    arrayList.add("홍길동");
    arrayList.add("홍길동");
    arrayList.add("홍길동");

    //삭제
      arrayList.remove(0);
      arrayList.remove("홍길동2");

    // 리스트를 출력한다
    for (int i = 0; i < arrayList.size(); i++) {
      System.out.println(arrayList.get(i));
    }
  }
}
