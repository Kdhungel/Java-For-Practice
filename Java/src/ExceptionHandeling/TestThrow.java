package ExceptionHandeling;

public class TestThrow  {

    public static void main(String[] args) {
    try{
        throw new UserDefinedException("This is user defined exception");
    } catch (UserDefinedException ude){
        System.out.println("Caught an exception");
        System.out.println(ude.getMessage());
    }
    }
}
class UserDefinedException extends  Exception{
    public UserDefinedException(String str){
        super(str);
    }
}