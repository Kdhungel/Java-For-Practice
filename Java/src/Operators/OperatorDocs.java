package Operators;

import java.sql.SQLOutput;

public class OperatorDocs {
    /*
    # symbol that is used to perform operations.
    # Types
        1. Unary Operator (postfix [exp++,exp--], prefix[++exp, --exp, ~)
        2. Arithmetic Operator: +,-,*,/,%
        3. Shift Operator: << , >>, >>>
        4. Relational Operator: ==, !=, <=, >=, <, >
        5. Bitwise Operator: &, |, ^
        6. Logical Operator: &&, ||
        7. Ternary Operator: ? :
        8. Assignment Operator: =, +=. -=, *=, /=, %=
     */

    public static void main(String[] args) {
        int x = 10;
        int y = 10;
//        System.out.println(x++);
//        System.out.println(++x);
//        System.out.println(x--);
//        System.out.println(--x);
        System.out.println(x++ + ++x); //  (10 + 11) + (1+10) = 11 + 11 = 22
        System.out.println(y++ + y++); // (10 + 1) + (10 (+ 1)) = 21

        System.out.println(10<<2); // 10 * 2 ^ 2 = 10 * 4 = 40
        System.out.println(10<<3); // 10 * 2 ^ 3 = 10 * 8 = 80

        System.out.println(10 >> 3); // 10 / 2 ^ 3 = 10/4 = 2
        //---------------------------IMPORTANT---------------------
        int a = 10;
        int b = 5;
        int c = 20;
        System.out.println(a < b && a < c); // False
        System.out.println(a < b || a < c); // True
        a = 2;
        b = 5;
        int min = (a<b)? a:b;
        System.out.println(min);
        // a = a + b -> a +=b,
    }
}
