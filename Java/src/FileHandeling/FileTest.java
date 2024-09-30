
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;

public class FileTest {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/kdhungel/Desktop/Everything/Learning Zone/Programming/JAVA/JAVA Package-Broadway/myFiles/test.txt");
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        File dir = new File("/Users/kdhungel/Desktop/Everything/Learning Zone/Programming/JAVA/JAVA Package-Broadway/myFiles");
        dir.mkdir();

        //get all filenames from folder.
        String[] fileNames = dir.list();
        System.out.println(Arrays.toString(fileNames));
        System.out.println(Arrays.asList(fileNames).contains("test.txt")); //converting array to list and checking if the file exists.

        //get all files from folder
        File[] files = dir.listFiles();
//        for (File fl : files){
//            System.out.println(Files.readString(Path.of(fl.getAbsolutePath())));
//        }
        Arrays.asList(files).forEach(f ->
                {
                    try {
                        System.out.println(Files.readString(Path.of(f.getAbsolutePath())));
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }

        );
        Files.copy(Path.of(file.getAbsolutePath()), Path.of("/Users/kdhungel/Desktop/Everything/Learning Zone/Programming/JAVA/JAVA Package-Broadway/myFiles/copied.txt"), StandardCopyOption.REPLACE_EXISTING);
        Files.delete(Path.of("/Users/kdhungel/Desktop/Everything/Learning Zone/Programming/JAVA/JAVA Package-Broadway/myFiles/copied.txt"));
    }
}
