package String;

public class Test {
    public static void main(String[] args) {
        String name = "Kritish";
//        name[0] = "L"; Not possible because string is immutable.
//        String newName = name.concat(" ").concat("Dhungel");
//        name = name.concat(" ").concat("Dhungel");
//        System.out.println(newName);
//        System.out.println(name);
        for (int i = 0; i < name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
}
