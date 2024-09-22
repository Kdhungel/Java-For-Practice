package Methods;
import  java.util.Scanner;
public class Calculator {
    public static double add(double num1,double num2){
        return  num1 + num2;
    }
    public static double subtract(double num1,double num2){
        return  num1 - num2;
    }
    public static double divide(double num1,double num2){
        return  num1 / num2;
    }
    public static double multiply(double num1,double num2){
        return  num1 * num2;
    }
    public static void printCaLculation(String operation, double num1, double num2, double result){
        System.out.println("The result of "+ operation+ " between "+ num1+ " and "+ num2 + " is "+result);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Number");
        double num1 = scan.nextDouble();;
        System.out.println("Enter Second Number");
        double num2 = scan.nextDouble();


        double additionResult = add(num1,num2);
        printCaLculation("addition", num1, num2, additionResult);
        double multiplicationResult = multiply(num1,num2);
        printCaLculation("multiplication", num1, num2, multiplicationResult);
        double subtractResult = subtract(num1,num2);
        printCaLculation("subtraction", num1,num2, subtractResult);
        double divideResult = divide(num1,num2);
        printCaLculation("division", num1,num2,divideResult);
    }
}
