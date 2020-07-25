package HASH_MAP;

public class MapUsingLLClient {
    public static void main(String[] args) {

        MapUsingLinkedList map = new MapUsingLinkedList();

        map.put("apple", "mast he");
        map.put("mango", "cool he");
        map.put("grapes", "khatte he");

        System.out.println(map);

        System.out.println(map.get("apple"));

        System.out.println(map.remove("grapes"));

        System.out.println(map);


    }
}
