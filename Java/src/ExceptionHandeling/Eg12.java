package ExceptionHandeling;

import java.io.IOException;

public class Eg12 {
 
    
    public static void main(String[] args) throws IOException {
        M m = new M();
        m.method();
        System.out.println("Normal Flow");
    }
    
}

class M {
       void method() throws IOException {
        System.out.println("Device operation performed");
    }
}