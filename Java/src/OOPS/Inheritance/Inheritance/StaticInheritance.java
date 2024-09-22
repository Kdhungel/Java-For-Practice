package OOPS.Inheritance;
//Single Inheritance
// When a class inherits another class
class Animal {
    void eat(){
        System.out.println("Eating");
    }

}
class Dog extends Animal{
    void bark(){
        System.out.println("barking");
    }
}



public class StaticInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}