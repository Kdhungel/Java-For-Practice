package ExceptionHandeling;

import java.io.IOException;

public class Eg11 {
    void m() throws IOException {
        throw new IOException("Device ERROR");
    }

    void n() throws IOException {
        m();
    }
    
    void p() {
        try{
            n();
        } catch (Exception e) {
            System.out.println("Exception Handeled");
        }
    }
    public static void main(String[] args) {
        Eg11 obj = new Eg11();
        obj.p();
        System.out.println("Baki Code");
    }
    
}
