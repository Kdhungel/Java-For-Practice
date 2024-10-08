package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("Enter Regex Pattern: ");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter Text: ");
            Matcher matcher = pattern.matcher(sc.nextLine());
            boolean found = false;

            while (matcher.find()){
                System.out.println("The txt is found "+ matcher.group()+ " starting index at "+ matcher.start()+ " and ending at "+ matcher.end());
                found = true;
            }
            if (!found){
                System.out.println("No match found.");
            }
        }
    }
}
