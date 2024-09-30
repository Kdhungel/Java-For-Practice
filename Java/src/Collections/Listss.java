package Collections;

import java.util.LinkedList;
import java.util.List;

public class Listss {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
        List<String> list = new LinkedList<>(); //same as array list but faster.
        list.add("Nepal");
        list.add("China");
        list.add("India");
        list.add("Pakistan");

        for (String s : list){
            System.out.println(s);
        }
    }
}
