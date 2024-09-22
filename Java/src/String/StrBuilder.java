package String;

import java.util.StringJoiner;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder s1 = new StringBuilder("Hello");
        StringBuilder s2 = new StringBuilder(" World");
        StringBuilder s = s1.append(s2);
        System.out.println(s);

        String n = new String("Hi");
        String n1 = new String("World");
        String n3 = String.join(" ",n, n1);
        System.out.println(n3);

        StringJoiner sj = new StringJoiner(", ");
        sj.add("Hello");
        sj.add("World");
        System.out.println(sj);

    }
}
