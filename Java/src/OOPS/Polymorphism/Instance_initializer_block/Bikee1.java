package OOPS.Polymorphism.Instance_initializer_block;

public class Bikee1 {
   final int speedlimit = 90;
   final void run(){
//        speedlimit =  400;
        System.out.println(speedlimit);
    }

    public static void main(String[] args) {
        Bikee1 b = new Bikee1();
        b.run();
    }
}

