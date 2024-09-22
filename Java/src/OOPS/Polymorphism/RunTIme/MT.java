package OOPS.Polymorphism.RunTIme;

class MT extends Bike{
    void run(){
        System.out.println("MT is running");
    }

    public static void main(String[] args) {
        Bike b = new MT();
        b.run();
    }
}
