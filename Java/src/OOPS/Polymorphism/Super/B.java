package OOPS.Polymorphism.Super;

public class B {
    B(){
        System.out.println("ANimal is created");
    }
}

class D extends  B{
    D(){
//        super();
        System.out.println("Dog is created");
    }
}