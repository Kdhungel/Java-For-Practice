package FileHandeling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        FileReader file = new FileReader("/Users/kdhungel/Desktop/Everything/Work/Team Vertex/JAVA Complete Package/Java-For-Practice/Java/src/FileHandeling/test.txt");
      BufferedReader br = new BufferedReader(file);
      String line;
        while ((line = br.readLine()) !=null){
            System.out.println(line);
        }


}
}
