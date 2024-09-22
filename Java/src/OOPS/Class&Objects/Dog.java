package OOPS;

public class Dog {
    String name;
    String breed;
    String color;
    int age;

    void bark(String name){
        name = name;
        System.out.println(name+ " is barking.");
    }
    void eat(){
        System.out.println("Dog is eating.");
    }

    void insertRecord(String n, String b, String c, int a){
        name = n;
        breed = b;
        color = c;
        age = a;
    }
    void printDogIngfo(){
        System.out.println(name + " of "+ breed+ " breed of "+ color+" color. And it is "+ age+" years old.");
    }
}
