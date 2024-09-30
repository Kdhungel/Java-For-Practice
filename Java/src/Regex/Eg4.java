package Regex;

import java.util.regex.Pattern;

public class Eg4 {
    public static void main(String[] args) {
        System.out.println("? quantifier ...");
        System.out.println(Pattern.matches("[amn]?", "a"));
        System.out.println(Pattern.matches("[amn]?", "aaa"));
        System.out.println(Pattern.matches("[amn]?", "ammmnnnn"));
        System.out.println(Pattern.matches("[amn]?", "azztata"));
        System.out.println(Pattern.matches("[amn]?", "amn"));
        System.out.println(Pattern.matches("[amn]?", "am"));
        System.out.println("+ quantifier");
        System.out.println(Pattern.matches("[amn]+", "a"));
        System.out.println(Pattern.matches("[amn]+", "aaa"));
        System.out.println(Pattern.matches("[amn]+", "aaammmmnnnnn"));
        System.out.println(Pattern.matches("[amn]+", "azzattta"));

        System.out.println("* quantifier");
        System.out.println(Pattern.matches("[amn]*", "ammmna"));




    }
}
