package OOPS.Inheritance;
// When two or more classes inherits a single class

class A {
    void eat(){
        System.out.println("eating");
    }

}
class D extends  A{
    void bark(){
        System.out.println("Barking");
    }
}
class C extends  A{
    void meow(){
        System.out.println("Meowing");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        C c = new C();
        c.meow();
        c.eat();
//        c.bark();
    }
}
