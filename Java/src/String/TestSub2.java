package String;
import java.util.Arrays;

public class TestSub2 {
    public static void main(String[] args) {
        String text = new String("Hello, I ma Kritish");
        String[] sentences = text.split("\\.");
        System.out.println(Arrays.toString(sentences));
    }

}
