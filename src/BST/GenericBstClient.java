package BST;

import java.util.LinkedList;

public class GenericBstClient {
    public static void main(String[] args) {

        GenericBst<Integer> tree = new GenericBst();
        tree.insert(5);
        tree.insert(1);
        tree.insert(6);

        System.out.print("Level-Order Traversal : ");
        tree.levelordertraversal();

        System.out.println();
        System.out.print("In-Range : ");
        tree.inrange(3,8);

        LinkedList<Integer> list= tree.sorted();
        for (Integer item: list) {
            System.out.println(item);
        }

        System.out.println("Pre-Order : ");
        tree.display();

    }
}
