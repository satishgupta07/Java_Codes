package LINKED_LIST;

public class LinkedListClient {
    public static void main(String[] args) {
        LinkedList list  = new LinkedList();

        list.insertfirst(1);
        list.insertfirst(2);
        list.insertfirst(3);

        list.insertlast(4);
        list.insertlast(5);
        list.insertlast(6);

        list.display();

        System.out.println(list.get(3));

        System.out.println(list.deletefirst());

        System.out.println(list.deletelast());

        list.display();
        System.out.println();

        list.insertbetween(2,7);

        list.display();
        System.out.println();
        System.out.println(list.deletebetween(3));

        list.display();

        list.insertfirst(8);
        list.insertfirst(8);
        System.out.println();
        list.display();

        list.removeduplicates();
        System.out.println();
        list.display();
        System.out.println();
        System.out.println(list.find(1));
        System.out.println(list.find(9));
    }
}
