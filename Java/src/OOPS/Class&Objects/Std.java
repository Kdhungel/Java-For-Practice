package OOPS;

public class Std {
    int rollNo;
    String name;
    static String college = "TVN";

    static void change(){
        college = "Khwopa";
    }
    //constructor
    Std(int r, String n){
        this.rollNo = r;
        this.name = n;
    }
    void display(){
        System.out.println(rollNo + " "+ name + " "+ college);
    }
}
