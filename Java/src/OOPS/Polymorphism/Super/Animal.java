package OOPS.Polymorphism.Super;

class Animal {
    String color = "pink";
}
class Dog extends  Animal{
    String color = "black";
    void printColor(){
        System.out.println(color); //black
        System.out.println(super.color); //pink
    }
}
