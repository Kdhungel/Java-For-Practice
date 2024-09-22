package Methods;

public class EvenorOdd {

    public static String findEvenorOdd(int num){
        String result;
        if(num % 2 == 0){
            result = "Even";
        }
        else{
            result = "odd";
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(findEvenorOdd(2));
    }
}
