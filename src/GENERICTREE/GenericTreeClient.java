package GENERICTREE;

import java.util.Scanner;

public class GenericTreeClient {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        GenericTree tree = new GenericTree();

        tree.insert(s);

        tree.display();

        System.out.println("Count : "+tree.count());

        System.out.println("Max : "+tree.max());

        System.out.print("Post-Order : ");
        tree.postorder();

        tree.depth(1);

        System.out.println("Height : "+tree.heigth());

        System.out.print("Level-Order : ");
        tree.levelorder();
    }
}
