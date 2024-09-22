package OOPS.Polymorphism.Instance_initializer_block;

public class Bike {
    int speed;
    Bike(){
//        System.out.println("Speed is "+speed);
        System.out.println("Constructor is called");

    }
    {
//        speed = 100;
        System.out.println("Instance Init Block is called");
    }


    public static void main(String[] args) {
        Bike b1 = new Bike();
        Bike b2 = new Bike();

    }
}

