package OOPS.Polymorphism.Instance_initializer_block;

public class Student {
    int id;
    String name;
    final String DOB;
    Student() {
        DOB = "Jan 2";
//        DOB = "5 Spet";
        System.out.println(DOB);
    }

    public static void main(String[] args) {
        new Student();
    }
}
