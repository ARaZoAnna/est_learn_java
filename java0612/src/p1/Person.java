package p1;

import javax.sound.midi.Soundbank;

public class Person {

  String name;
  int age;
  final static String GENDER = "woman";
  final static String RACE = "Asian";

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void sayHello() {
    System.out.println("Hello my name is" + this.name);
  }

  public static void say(){
    System.out.println("hell");
  }

  public void introduce() {
    System.out.println("I am" + this.age + " years old.");
    System.out.println("I'm " + RACE + " " + GENDER);
  }

  protected void testMethod(){
    System.out.println("test");
  }
}
