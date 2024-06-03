public class Java0531 {
  void reverse(int[] temp) {
    int len = temp.length;
    for (int i = 0; i < len/2; i++) {
      int tmp = temp[i];
      temp[i] = temp[len-1-i];
      temp[len-1-i] = tmp;
    }
  }
  public static void main(String[] args) {
    int[] arr = {1, 3, 5, 7, 9};
    Java0531 main = new Java0531();
    main.reverse(arr);
    for(int num : arr){
        System.out.print(num);
    }
  }
}

/*String a = "hello";
String b = "java";
String c = "hello";

System.out.println(a.equals(b));
System.out.println(a.equals(c));

System.out.println(a == b);
System.out.println(a == c);*/

       /* String na = new String("hello");
       String nb = new String("java");
       String nc = new String("hello");

       System.out.println(na.equals(nb));
       System.out.println(na.equals(nc));

       System.out.println(na == nb);
       System.out.println(na == nc);*/
