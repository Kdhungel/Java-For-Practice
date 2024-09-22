package OOPS.Polymorphism.Binding;
class Aniaml{
    void eat(){
        System.out.println("ANimal is eatng");
    }
}
public class Dog extends  Aniaml{
    void eat(){
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        Dog d1 = new Dog();
//        System.out.println(d1 instanceof Dog);
        d1.eat();
    }
}
class Cat{
    void meow(){
        System.out.println("Meow");

    }
}
