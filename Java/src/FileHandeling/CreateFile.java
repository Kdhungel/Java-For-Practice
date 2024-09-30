package FileHandeling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        FileOutputStream file = new FileOutputStream("/Users/kdhungel/Desktop/Everything/Work/Team Vertex/JAVA Complete Package/Java-For-Practice/Java/src/FileHandeling/tests.txt\n");
        file.write("Its sunny outside".getBytes());
        file.close();
        System.out.println("Success!");
    }
}
