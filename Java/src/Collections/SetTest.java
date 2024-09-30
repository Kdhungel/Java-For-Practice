package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();
        set.add("java");
        set.add("sql");
        set.add("php");
        set.add("sql");
        set.add("java");
        set.add("python");
        set.add("android");


        for (String s : set){
            System.out.println(s);
        }

    }
}
