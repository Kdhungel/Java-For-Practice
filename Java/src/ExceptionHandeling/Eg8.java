package ExceptionHandeling;

public class Eg8 {
    public static void main(String[] args) {
        try {
            try{
                System.out.println("Going to divide by 0");
                int b = 23/0;
            } catch (ArithmeticException e){
                System.out.println(e);
            }
            try{
                int a[] = new int[5];
                a[5]= 4;
        } catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        } catch (Exception e){
            System.out.println("Handled by outer catch statement");
        }
    }
}
