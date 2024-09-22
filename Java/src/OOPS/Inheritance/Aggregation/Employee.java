package OOPS.Inheritance.Aggregation;

public class Employee {
    int id;
    String name;
    Address address;

    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Employee() {
    }

    void display(){
        System.out.println(id + " "+ name);
        System.out.println(address.city + " "+ address.state+ " "+ address.country);
    }

    public static void main(String[] args) {
        Address add1 = new Address("Kathmandu", "Bagmati","Nepal");
        Address add2 = new Address("Lalitpur", "Bagmati","Nepal");
        Address add3 = new Address("Chandrapur", "Madhesh","Nepal");

        Employee e1 = new Employee(111, "Hari", add1);
        Employee e = new Employee(121, "Ram", add2);
        Employee kritish = new Employee(121, "Kritish", add3);
        e1.display();
        e.display();
        kritish.display();
    }
}
