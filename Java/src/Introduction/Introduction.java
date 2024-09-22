package Introduction;

public class Introduction {
    public static void main(String[] args) {
    String fname = "Kritish";
    String lname = "Dhungel";

    System.out.println("My name is "+fname+" "+lname);
        String result = String.format("My name is %s %s", fname, lname);
        System.out.println(result);
        int a = 2; // local variable of main method
        System.out.println(a);
        test();

    }
    static void test(){
        int a = 10; // local variable of test method
        System.out.println(a);

    }
}
//local variable
// instance variable
// static variable
