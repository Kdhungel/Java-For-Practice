package FileHandeling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFileUsingInputStream {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("/Users/kdhungel/Desktop/Everything/Work/Team Vertex/JAVA Complete Package/Java-For-Practice/Java/src/FileHandeling/test.txt");
        int data;
        while ((data = file.read()) != -1){
            System.out.print((char) data);
        }
    }
    }

