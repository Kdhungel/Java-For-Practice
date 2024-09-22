package OOPS.Polymorphism.MethodOverriding;

public class Test {
    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println(s.getRateOfInterest());
        Prabhu p = new Prabhu();
        System.out.println(p.getRateOfInterest());
    }
}
