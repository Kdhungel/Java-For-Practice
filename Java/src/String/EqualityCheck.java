package String;

public class EqualityCheck {
    // 2 ==  2
    // "Kritish" == "Kritish" -> This never should be used
    public static void main(String[] args) {
        String name1 = "Kritish";
        String name2 = "Kritish";
        String name3 = new String("Kritish");
        String name4 = "Hari";
        System.out.println(name1.equals(name2));
        System.out.println(name1.equals(name3));
        System.out.println(name1.equals(name4));
        String name5 = "KRITISH";
        System.out.println(name1.equals(name5));
        System.out.println(name1.equalsIgnoreCase(name5));

    }
}
