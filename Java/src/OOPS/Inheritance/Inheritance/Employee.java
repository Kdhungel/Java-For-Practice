package OOPS.Inheritance;

public class Employee {
    float salary = 40000;
}

class Programmer extends Employee{

    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Salary of the programmer is "+ p.salary);
        System.out.println("Bonus of Programmer is "+ p.bonus);
    }
}
