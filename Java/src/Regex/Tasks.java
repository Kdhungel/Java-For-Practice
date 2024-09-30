package Regex;

import java.util.regex.Pattern;

public class Tasks {
    public static void main(String[] args) {
        /*Create a regular expression that accepts alphanumeric characters only. Its length must be six characters long only.*/
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Kriti1"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "Kritsh1"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "asdf12"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aaa12"));
        System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "aa$121"));
/*Create a regular expression that accepts 10 digit numeric characters starting with 7, 8 or 9 only.*/
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "1234567890"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "7234567890"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "8234567890"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9234567890"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "9234567890232"));
        System.out.println(Pattern.matches("[789]{1}[0-9]{9}", "92345678"));
    }
}
