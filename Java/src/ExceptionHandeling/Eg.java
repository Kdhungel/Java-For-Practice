package ExceptionHandeling;

public class Eg {
    public static void main(String[] args) {
    try{
        int data = 50/0;
    }catch (Exception a){
        System.out.println("Cannot divide anything by 0.");
    }
    }
}
