package ExceptionHandeling;

public class Eg6 {
    public static void main(String[] args) {
        try{
            String s = null;
            System.out.println(s.length());
        } catch (ArithmeticException e){
            System.out.println("Arithmatic exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound.");
        } catch (Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("rest of the code");
    }
}
