package Regex;

import java.util.regex.Pattern;

public class Eg5 {
    public static void main(String[] args) {
        System.out.println("d");
        System.out.println(Pattern.matches("\\d", "abc"));
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\d", "1234"));
        System.out.println(Pattern.matches("\\d", "1234abc"));

        System.out.println("D");
        System.out.println(Pattern.matches("\\D", "abc"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\D", "443"));
        System.out.println(Pattern.matches("\\D", "443asd"));
        System.out.println(Pattern.matches("\\D", "-1"));
        System.out.println(Pattern.matches("\\D", "m"));

        System.out.println("D with quantifier");
        System.out.println(Pattern.matches("\\D", "kri"));
        System.out.println(Pattern.matches("\\D*", "kri"));
    }
}
