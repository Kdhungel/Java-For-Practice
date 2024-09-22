package ControlStatement;
/*
 Syntax:
 if(condition){
     //statement
 } else if(condition) {
     //statement
 } else {
     //statement
 }
  */
public class ifelseLearning {
    public static void main(String[] args) {
        int x = 10;
        int y = -10;

        if (x > 0 && y > 0){
            if (x+y >20){
                System.out.println("x + y is greater than 20");
            } else if(x + y == 20){
                System.out.println("x + y is equal to 20");
            } else {
                System.out.println("x + y is smaller to 20");
            }
        } else {
            System.out.println("Enter positive numbers only.");
        }
    }
}
