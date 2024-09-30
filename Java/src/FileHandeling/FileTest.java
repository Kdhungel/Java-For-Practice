package FileHandeling;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/kdhungel/Desktop/Everything/Work/Team Vertex/JAVA Complete Package/Java-For-Practice/Java/src/FileHandeling/test.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        File dir = new File("/Users/kdhungel/Desktop/Everything/Work/Team Vertex/JAVA Complete Package/Java-For-Practice/Java/src/FileHandeling/myFiles");
        dir.mkdir();

        String[] fileNames = dir.list();
        System.out.println(Arrays.toString(fileNames));
        System.out.println(Arrays.asList(fileNames).contains("test.txt"));

        File[] files = dir.listFiles();
        for (File fl : files){
            System.out.println(Files.readString(Path.of(fl.getAbsolutePath())));
        }
    }
}
