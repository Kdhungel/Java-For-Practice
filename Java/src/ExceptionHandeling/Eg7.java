package ExceptionHandeling;

public class Eg7 {
    public static void main(String[] args) {
        try{
            int a[]= new int[5];
            a[5]= 30/0;
        } catch (Exception e){
            System.out.println("Common task completed");
        }
//        catch (ArithmeticException e){
//            System.out.println("Task 1 completed");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Rest of the code");
//        }
    }
}
