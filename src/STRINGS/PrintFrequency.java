package STRINGS;

import java.util.HashMap;
import java.util.Map;

public class PrintFrequency {
    public static void main(String[] args) {
        String str = "SatishKumarGupta";

        HashMap<Character,Integer> map = new HashMap<>();

        // Converting given string to char array
        char[] strArray = str.toCharArray();

        for (char c : strArray) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c,1);
            }
        }

        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
