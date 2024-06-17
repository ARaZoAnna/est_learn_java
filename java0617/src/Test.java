import java.util.ArrayList;

public class Test {

    public static void main(String[] args){
        /*ArrayList<Animal> stringArrayList = new ArrayList<>();
        stringArrayList.add(new Lion());*/

        Box<String> stringBox = new Box<>();
        Box<Integer> integerBox = new Box<>();
        //박싱 언박싱 개념이 뭐지?
        integerBox.set(6);
        int i = integerBox.get();
    }
}
