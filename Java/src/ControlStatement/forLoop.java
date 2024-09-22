package ControlStatement;
/*
Synatx:
for(initialization; condition; inc/dec){
        //statement
}
 */

public class forLoop {
    public static void main(String[] args) {
//        int sum = 0;
//        for(int i = 1; i <= 10; i++){
//            sum = sum + i;
//        }
//        System.out.println("The sum of first 10 natural number is "+ sum);
//
        //for each loop
        String[] language = {"Java", "C", "C++", "Python", "JavaScript"};
        for (String name:language){
            System.out.println(name);
        }
        for (int i = 0; i < language.length; i++){
            System.out.println(language[i]);

        }
    }
}
