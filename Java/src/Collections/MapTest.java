package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        // subject, marks
//        Map<String, Integer> map = new HashMap<>(); -> Random Order
//        Map<String, Integer> map = new TreeMap<>(); -> Alphabetical Order
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Nepali", 80);
        map.put("English", 90);
        map.put("Computer", 99);
        map.put("Social", 85);

        for(String i: map.keySet()){
            System.out.println(i + " = "+ map.get(i));
        }
    }
}
