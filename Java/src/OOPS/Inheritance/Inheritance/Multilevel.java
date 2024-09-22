package OOPS.Inheritance;
// chain of inheritance

class Animals{
    void eat(){
        System.out.println("Eating");
    }
}

class Dogs extends  Animals{
    void bark(){
        System.out.println("Barking");
    }
}
class SmallDog extends  Dogs{
    void anything(){
        System.out.println("Anythin");
    }
}


public class Multilevel {
    public static void main(String[] args) {
    SmallDog d = new SmallDog();
    d.anything();
    d.bark();
    d.eat();
    }
}
