package OOPS.Abstraction.Interface;

public interface Drawable {
    void draw();

}
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("Drawing rectangle");
    }
}
class  Circle implements Drawable{
    public void draw(){
        System.out.println("Drawing Circle");
    }
}