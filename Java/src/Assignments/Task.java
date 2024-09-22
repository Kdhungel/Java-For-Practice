package Assignments;
import  java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     int a = 0; //input
     int b = 1; //input
     int limit = 100; //input
     while (a <= limit){
         System.out.print(a + " ");
         int next = a + b;
         a = b;
         b = next;
     }
    }

}

