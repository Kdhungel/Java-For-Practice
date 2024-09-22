package Methods;

public class InstanceMethod {
    public static void main(String[] args) {
        InstanceMethod obj = new InstanceMethod();

        System.out.println("The sum is :"+ obj.add(12,14));
    }
    public double add(int a, int b){
        int s;
        s = a + b;
        return  s;
    }
}
