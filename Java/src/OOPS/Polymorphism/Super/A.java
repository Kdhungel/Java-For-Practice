package OOPS.Polymorphism.Super;

public class A {
    void eat(){
        System.out.println("Eating");
    }
}
class Dogs extends  A{
    void eat(){
        System.out.println("Dog is Eating");
    }
    void bark(){
        System.out.println("Dog is barking");
    }
    void work(){
        super.eat();
        bark();
    }
}