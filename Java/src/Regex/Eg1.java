package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Eg1 {
    public static void main(String[] args) {
        // Way ONE
        Pattern p = Pattern.compile(".s");
        Matcher m = p.matcher("as");
        boolean b = m.matches();
        System.out.println(b);

        //WAY TWO
        boolean b2 = Pattern.compile(".s").matcher("as").matches();
        System.out.println(b2);

        //WAY THREE
        boolean b3 = Pattern.matches(".s", "as");
        System.out.println(b3);
    }
}
