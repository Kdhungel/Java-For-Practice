package ExceptionHandeling;

public class Eg9 {
    public static void validate(int age){
        if (age<18){
            throw new ArithmeticException("Person is not allowed to drink.");
        } else{
            System.out.println("Allowed to drink.");
        }
    }
    public static void main(String[] args) {
     validate(11);
        System.out.println("Rest of the code.");
    }
}
