package ExceptionHandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Java10 {
    public  static void method() throws FileNotFoundException {
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        throw  new FileNotFoundException();
    }
    public static void main(String[] args) {
        try{
            method();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Rest of the code");
    }
}
