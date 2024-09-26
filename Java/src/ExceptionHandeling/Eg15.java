
public class Eg15 {

    public int divideNum(int m, int n) throws ArithmeticException {
        int div = m / n;
        return div;
    }

    public static void main(String[] args) {
        Eg15 obj = new Eg15();
        try {
            System.out.println(obj.divideNum(45, 0));
        } catch (ArithmeticException e) {
            System.out.println("Number cannot be divided by 0.");
        }
        System.out.println("Rest of the code");
    }

}