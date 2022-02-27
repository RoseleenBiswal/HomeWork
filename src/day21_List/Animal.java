package day21_List;

public class Animal {
    int legs;
    double weight;
    public void run(String animalName){
        System.out.println(animalName + "running.");
    }
}
  class Dog extends Animal{
    public void bark(){
        System.out.println("Dog barking...");
    }
  }

  class Cat extends Animal{
    public void sleep(){
        System.out.println("Cat sleeping...");
    }
  }