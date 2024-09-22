package OOPS.Abstraction;

abstract  class Bike{
    Bike(){
        System.out.println("Bike is created");
    }
    abstract  void run();
    void changeear(){
        System.out.println("Gear Changed");
    }
}

class Honda extends Bike{
    void run(){
        System.out.println("Honda is running");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changeear();
    }
}
