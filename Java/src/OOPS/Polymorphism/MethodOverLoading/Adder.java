package OOPS.Polymorphism.MethodOverLoading;
//Method Overloading
public class Adder {
    static int add(int a, int b){
        return  a + b;
    }
    static double add(double a, double b){
        return  a + b;
    }
    static int add(int a, int b, int c){
        return  a + b + c;
    }

}
