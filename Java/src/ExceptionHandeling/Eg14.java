public class Eg14 {

    public void checkNum(int num) {
        if (num < 1) {
            throw new ArithmeticException("Number is negative or zero, cannot calculate its square");
        } else {
            System.out.println("Square of " + num + " is " + (num * num));
        }
    }

    public static void main(String[] args) {
        Eg14 obj = new Eg14();
        obj.checkNum(-3);
        System.out.println("Rest of the code");
    }

}
