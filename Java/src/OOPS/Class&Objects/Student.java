package OOPS;

public class Student {
    //properties
    int id;
    String name;

    void insertRecord(int r, String n){
        id = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(id + " "+ name);
    }
}
