public class Java0611 {
    public static void main(String[] args){
        add(1,3);
        minus(3,4);
        mul(1,1);
        div(3,4);

        login("zoan", "a1245");
    }
    static int add(int a, int b){
        return a+b;
    }
    static int minus(int a, int b){
        return a-b;
    }
    static int mul(int a, int b){
        return a*b;
    }
    static double div(int a, int b){
        return (double)a /b;
    }

    static void login (String email, String password){

    }
}
