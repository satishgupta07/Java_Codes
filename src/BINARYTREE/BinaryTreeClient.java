package BINARYTREE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BinaryTreeClient {
    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("BinTreeInput.txt");

        Scanner sc =new Scanner(file);

        BinaryTree tree = new BinaryTree();

        tree.insert(sc);
        tree.insert(sc);
        tree.insert(sc);
        tree.insert(sc);
        tree.insert(sc);

        System.out.println("Pre-Order : ");
        tree.display();

        System.out.println("Post-Order : ");
        tree.postorder();

        System.out.println("Height : "+tree.height());

        System.out.println("Find : "+tree.find(24));

        System.out.println("Diameter : "+tree.diameter());

        System.out.println("Mirror-Image of tree : ");
        tree.mirror();
        tree.display();
    }
}
