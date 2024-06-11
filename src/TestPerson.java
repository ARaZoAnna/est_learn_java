public class TestPerson {
    public static void main(String[] args){
        Person person1 = new Person("김승조",0101000000,5000,12);
        Person person2 = new Person("맥스", 01011111111,500000,20);
        Person person3 = new Person("은우", 01011113111,3500000,21);
        Person person4 = new Person("상희", 01011144111,44400000,22);

        //person4.sayMoney();

        Student student = new Student();
        person4.teaching(student);
        person4.cheating(student);
    }

}
