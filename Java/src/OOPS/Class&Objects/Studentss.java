package OOPS;

public class Studentss {
    int rollNo;
    String name;
    static String college = "TVN";

    Studentss(int r, String n){
        this.rollNo = r;
        this.name = n;
    }

    void display(){
        System.out.println(rollNo+ " "+ name + " "+ college);
    }

}
