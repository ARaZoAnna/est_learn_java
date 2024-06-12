package car.example;

import car.Animal;

public class Dog extends Animal {

  public static void main(String[] args) {
    Dog dog = new Dog();
    System.out.println(dog.name);
    System.out.println(dog.gender);
    System.out.println(dog.barking);
  }
}
