package OOPS.Polymorphism.MethodOverriding;

public class Bank {
    int getRateOfInterest(){
        return  0;
    }
}
class SBI extends  Bank{
    int getRateOfInterest(){
        return  5;
    }
}
class Prabhu extends  Bank{
    int getRateOfInterest(){
        return  6;
    }
}