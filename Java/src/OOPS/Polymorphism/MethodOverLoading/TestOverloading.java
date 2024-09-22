package OOPS.Polymorphism.MethodOverLoading;

public class TestOverloading {
    public static void main(String[] args) {
        System.out.println("Main with String[]");
    }

    public static void main(String args) {
        System.out.println("Main with string");
    }

    public static void main() {
        System.out.println("Main without parameter");
    }
}
