package Regex;

import java.util.regex.Pattern;

public class Eg2 {
    public static void main(String[] args) {
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".s", "kd"));
        System.out.println(Pattern.matches(".s", "kdh"));
        System.out.println(Pattern.matches(".s", "kdhs"));
        System.out.println(Pattern.matches("[.s]", "kssss"));
        System.out.println(Pattern.matches("..s", "kws"));
    }
}
