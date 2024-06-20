import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
  public static void main(String[] args) throws InterruptedException {
    /*ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3,1,10,9,5,20));*/

    /*numbers.stream().filter(integer -> integer % 2 == 0);
    numbers.stream().map(integer -> integer*2);
    numbers.stream().sorted();*/

    /*numbers.stream()
    .filter(integer -> integer % 2 == 0)
    .forEach(integer -> System.out.println(integer));*/

    /*List<Integer> collect = numbers.stream().map(integer -> integer * 2)
            .collect(Collectors.toList()); // collect로 List화 시켰다. Stream을 List로 바꿔준다.

    for(int i:collect){
      System.out.println(i);
    }*/

    /*numbers.stream().sorted().forEach(integer -> System.out.println(integer));*/

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

    List<Integer> num =
        numbers.stream()
            .filter(integer -> integer % 2 == 1)
            .collect(Collectors.toList());
    System.out.println(num);
  }
}


/*Thread thread1 = new Thread(new MyRunnable(1));
    Thread thread2 = new Thread(new MyRunnable(2));
    Thread thread3 = new Thread(new MyRunnable(3));
    Thread thread4 = new Thread(new MyRunnable(4));
    Thread thread5 = new Thread(new MyRunnable(5));

    thread1.start();
    thread2.start();
    thread3.start();
    Thread.sleep(5000);
    thread5.start();*/