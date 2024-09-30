package FileHandeling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) throws IOException {
        FileWriter file = new FileWriter("/Users/kdhungel/Desktop/Everything/Work/Team Vertex/JAVA Complete Package/Java-For-Practice/Java/src/FileHandeling/test.txt");
        file.write("ID - 1\n");
        file.write("Name = Kritish Dhungel \n");
        file.write("City = Kathmandu ");
        file.close();
        System.out.println("Success!");
    }
}
