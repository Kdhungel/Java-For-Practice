package ExceptionHandeling;

import java.io.IOException;

public class Eg13 {

    public static void main(String[] args) throws IOException {
        M m = new M();
        m.method();
        // System.out.println("Normal Flow");
        throw new IOException("Device Error");
        
    }

}

class M {
    void method() throws IOException {
        System.out.println("Device operation performed");
    }
}
/*
 * THROW
 * Java throw keyword is used throw an exception explicitly in the code, inside
 * the function or the block of code.
 * 
 * Type of exception Using throw keyword, we can only propagate unchecked
 * exception i.e., the checked exception cannot be propagated using throw only.
 * 
 * The throw keyword is followed by an instance of Exception to be thrown.
 * 
 * throw is used within the method.
 * 
 * We are allowed to throw only one exception at a time i.e. we cannot throw
 * multiple exceptions.
 * 
 */

/*
 * THROWS
 * Java throws keyword is used in the method signature to declare an exception
 * which might be thrown by the function while the execution of the code.
 * 
 * Using throws keyword, we can declare both checked and unchecked exceptions.
 * However, the throws keyword can be used to propagate checked exceptions only.
 * 
 * The throws keyword is followed by class names of Exceptions to be thrown.
 * 
 * throws is used with the method signature.
 * We can declare multiple exceptions using throws keyword that can be thrown by
 * the method. For example, main() throws IOException, SQLException.
 * 
 */