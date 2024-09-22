package OOPS.Abstraction;

import OOPS.Polymorphism.RunTIme.Bike;

public class MT extends Bikess {
    void run(){
        System.out.println("MT is running");
    }

    public static void main(String[] args) {
        Bikess obj = new MT();
        obj.run();
    }
}
