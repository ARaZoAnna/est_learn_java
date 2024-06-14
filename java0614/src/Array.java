import java.util.Scanner;
public class Array {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("배열의 사이즈를 정수로 입력하세요: ");
        int len = scanner.nextInt();
        int[] arr = new int[len];

        try{
            System.out.println("배열의 인덱스를 정수로 입력하세요: ");
            int idx = scanner.nextInt();
            System.out.println("배열 값을 정수로 입력하세요: ");
            arr[idx] = scanner.nextInt();

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어났어요.");
        }finally{
            scanner.close();
        }
    }
}
