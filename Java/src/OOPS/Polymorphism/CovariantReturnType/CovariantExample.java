package OOPS.Polymorphism.CovariantReturnType;

class A1 {
    A1 foo(){
        return  this;
    }
    void print(){
        System.out.println("Inside of Class A1");
    }
}
class A2 extends  A1{
    A1 foo(){
        return  this;
    }
    void print(){
        System.out.println("Inside of class 2");
    }
}

class A3 extends  A2{
    A1 foo(){
        return  this;
    }
    void print(){
        System.out.println("Inside class A3");
    }
}

public class CovariantExample {
    public static void main(String[] args) {
     A1 a1 = new A1();
     A2 a2 = new A2();
        ((A2)a2.foo()).print();

        A3 a3 = new A3();
        ((A3)a3.foo()).print();
    }
}
