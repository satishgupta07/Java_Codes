package ARRAYLIST;

public class ArrayListClient {
    public static void main(String[] args) {

        ArrayList list = new ArrayList();

        for (int i = 1; i <=100 ; i++) {
            list.add(i);
        }
        System.out.println("List Size : " +list.size());

        for (int i = 0; i <50 ; i++) {
            System.out.println(list.remove());
        }

        System.out.println("List Size : " +list.size());
    }
}
