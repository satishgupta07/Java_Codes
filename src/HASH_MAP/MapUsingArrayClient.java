package HASH_MAP;

public class MapUsingArrayClient {
    public static void main(String[] args) {

        MapUsingArray map = new MapUsingArray();

        map.put("apple", "mast he");
        map.put("mango", "cool he");
        map.put("grapes", "khatte he");

        System.out.println(map.get("apple"));
        System.out.println(map.get("mango"));
        System.out.println(map.get("grapes"));

        map.remove("grapes");
        System.out.println(map.get("grapes"));

    }
}
