package ExceptionHandeling;

public class Eg4 {
    public static void main(String[] args) {
        try{
            int a[] = new int[5];
            a[5] = 30/0;
        }
         catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        } catch (Exception e){
            System.out.println("Parent exception");
        }
        System.out.println("Rest of the code");
    }
}
