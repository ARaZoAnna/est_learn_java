public class Person {

    String name;
    int phoneNumer;
    int money;
    int age;

    public Person(String name, int phoneNumber, int money, int age){
        this.name = name;
        this.phoneNumer = phoneNumber;
        this.money = money;
        this.age = age;
    }
    public void sayHello() {
        System.out.println("my name is" + name);
    }

    public void sayMoney(){
    System.out.println("내가 가지고 있는 돈은 " + money*10000 +"원이야!");
    }

    public void teaching(Student student){
        student.levelUp();
    }

    public void cheating(Student student){
        student.levelDown();
    }
}
