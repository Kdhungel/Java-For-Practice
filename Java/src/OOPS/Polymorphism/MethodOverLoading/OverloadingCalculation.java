package OOPS.Polymorphism.MethodOverLoading;

public class OverloadingCalculation {
    void sum(int a, double b){
        System.out.println(a + b);
    }
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        OverloadingCalculation obj = new OverloadingCalculation();
        obj.sum(20,20);
        obj.sum(20,20,20);
    }
}
