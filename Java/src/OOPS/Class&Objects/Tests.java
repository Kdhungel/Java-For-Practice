package OOPS;

public class Tests {
    public static void main(String[] args) {
//        Studentss s1 = new Studentss(123, "Kritish");
//        Studentss s2 = new Studentss(456, "Ram");
//        Studentss.college = "Khwopa";
//    s1.display();
//    s2.display();
        Std.change();
        Std s1 = new Std(123, "Kritish");
        Std s2 = new Std(456, "Ram");
        s1.display();
        s2.display();
    }

}
/*
1. The static method cannot use non static data member or call non-static method directly.
2. this and super cannot be used.
 */

class A{
    static int a = 40;

    public static void main(String[] args) {
        System.out.println(a);
    }
}

class A2{
    static {
        System.out.println("Static block is called");
    }

    public static void main(String[] args) {
        System.out.println("hello");
    }
}