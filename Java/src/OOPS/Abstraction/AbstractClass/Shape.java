package OOPS.Abstraction;

abstract class Shape {
    abstract void draw();

}
class Rectangle extends  Shape{
    void draw(){
        System.out.println("Drawing rectangle");
    }
}
class Circle extends  Shape{
    void draw(){
        System.out.println("Drawing Circle");
    }
}