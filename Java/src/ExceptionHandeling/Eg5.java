package ExceptionHandeling;

import java.sql.SQLOutput;

public class Eg5 {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            System.out.println(a[10]);
        } catch (ArithmeticException e){
            System.out.println("Aritchmatic exception");
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound.");
        } catch (Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("rest of the code");
    }
}
