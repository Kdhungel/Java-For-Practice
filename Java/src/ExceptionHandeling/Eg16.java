public class Eg16 {
    static void method() throws ArithmeticException {
        System.out.println("Inside the method");
        throw new ArithmeticException("Throwing arithmatic exception");
    }

    public static void main(String[] args) {
        try {
            method();
        } catch (ArithmeticException e) {
            System.out.println("Caught in main()");
        }
    }

}
