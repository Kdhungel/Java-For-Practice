package ControlStatement;
/*
Syntax:
while(condition){
    //statements
    inc/dec
}
 */
public class whileLoop {
    public static void main(String[] args) {
//        int i = 0;
//        while(i < 10){
//            System.out.println(i);
//            i+= 2;
//        }
        int i = 0;
        do {
            System.out.println(i);
            i+= 2;
        } while(i<10);

    }
}
