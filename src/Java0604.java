import java.util.Scanner;
public class Java0604 {
 /* int cal(int n){
    int cnt = 1;
    int result = 0;
    while(cnt <= n){
      result += cnt;
      cnt++;
    }
    return result;
  }*/
  public static void main(String[] args) {
    /*Java0604 main = new Java0604();
    int result = main.cal(100);
    System.out.println(result);*/

    /*int[] numbers = {5,2,9,1,7,4,6,3,8};
    int len = numbers.length;
    int result = 0;
    int i = 0;
    while(i < len){
      result += numbers[i];
      i++;
    }
    result = result/len;
    System.out.println(result);*/

   /*int[] numbers = {10, 5, 8, 20, 3, 15, 9, 2};
   int len = numbers.length;
   int max = numbers[0];
   int idx = 0;
   while (idx < len){
    if(numbers[idx] > max){
     max = numbers[idx];
    }
    idx++;
   }
    System.out.println(max);*/

   /*int[] numbers = {4, -2, 9, -7, 5, 1, -3, 6, -1, 8};
   int len = numbers.length;
   int idx = 0;
   int posSum = 0; //양수의 합
   int negSum = 0; //음수의 합
   while(idx < len){
      if (numbers[idx] > 0) { // 양수라면
       posSum += numbers[idx];
      }
      else{ //음수라면
       negSum += numbers[idx];
      }
    idx++;
   }
   System.out.println("양수의 합 : " + posSum);
   System.out.println("음수의 합 : " + negSum);*/

   //짝수의 합 계산하기
   /*int result = 0;
   for(int i = 1; i <= 100; i++){
    if(i % 2 == 0){
     result += i;
    }
   }
   System.out.println(result);*/

   //3의 배수이면서 5의 배수인 수의 합
   /*Scanner scanner = new Scanner(System.in);
   int num = scanner.nextInt();
   for(int i = 1; i <=num; i++){
    if(i%3 == 0 && i%5 == 0){
        System.out.println(i);
    }
   }*/

   //피보나치 수열
   /*int n = 10; // 10항을 구한다.
   int[] arr = new int[n]; //배열을 사용한다.

   arr[0]= 1; //첫번째 항 초기화
   arr[1]= 1; //두번째 항 초기화

   for(int i = 2; i < n; i++){
    //이전 두 항의 합을 계산하여 다음 항을 구한다.
    arr[i] = arr[i-1] + arr[i-2];
   }
   //배열을 출력한다.
   for(int m : arr){
      System.out.print(m + " ");
   }*/

   //구구단 2단 출력하기
   /*for(int i = 1; i < 10; i++){
      System.out.println(String.format("2 x %s = %s",i ,(i*2)) );
   }*/

   // 구구단 19단을 역방향으로 출력
   /*for(int i = 19; i > 0; i--){
      System.out.println(String.format("19 * %s = %s", i,19*i));
   }*/

   //dailyQuiz
   //1인 변수 count 만들기
   /*int count = 1;
   //while 문으로 무한 반복문을 작성하여 count가 10,000이 되면 멈춤
   while(true){
    if(count == 10000){
     break;
    }
    count++;
   }
    System.out.println(count);*/

  for(int i = 9; i > 1; i--){
   for(int j = 9; j > 0; j--){
        System.out.println(String.format("%s x %s = %s",i,j,i*j));
   }
      System.out.println();
  }
  }
}


/*int num = 10;
    while (num >= 0) {
      System.out.println("현재 카운트 : " + num);
      num--;
    }
    System.out.println("카운트 종료");*/