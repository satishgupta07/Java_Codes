package HASH_MAP;

import java.util.HashMap;

public class HashMapEg {
    public static void main(String[] args) {

        HashMap<String,String> map = new HashMap<>();

        map.put("Shubham","Handsome");
        map.put("Ekta","Beautiful");
        map.put("Tarun","Google-Wala");

        System.out.println(map);

        System.out.println(map.get("Shubham"));

        map.remove("Shubham");

        System.out.println(map);

        for (String key: map.keySet()) {
            System.out.println(key);
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println(frequency("abacaacd"));
    }

    public static HashMap<Character,Integer> frequency(String str){

        HashMap<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else {
                map.put(ch,1);
            }
        }
        return map;
    }
}
