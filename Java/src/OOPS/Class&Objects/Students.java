package OOPS;

public class Students {
    int id;
    String name;
    int age;

    public Students() {
    }

    public Students(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Students(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Students s1 = new Students(1, "Kritish");
        Students s3 = new Students(1, "Kritish", 12);
        Students s2 = new Students(2, "Ram");

    }


    void display(){
        System.out.println(id + " "+ name);
    }



}
