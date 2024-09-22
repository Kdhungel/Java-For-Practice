package String;

public class StringOperation1 {
    public static void main(String[] args) {
        String name = "      Kritish      ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println(name.trim().startsWith("Kr"));
        System.out.println(name.endsWith("Kr"));
        String name1 = "Lionel Messi";
        System.out.println(name1.charAt(0));
        System.out.println(name1.charAt(3));
        System.out.println(name1.charAt(6));
        System.out.println(name1.length());
        String name2 = name1.intern();
        System.out.println(name2);

        int num = 10;
        String l = String.valueOf(num);
        System.out.println(l + 10);

        String s1 = "Java is the best programming in the world. Java is one of the top 3 languages.";
        String replaceString = s1.replace("Java","Lava");
        System.out.println(replaceString);
    }
}
