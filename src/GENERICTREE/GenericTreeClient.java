package GENERICTREE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GenericTreeClient  {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("input.txt");

        Scanner s = new Scanner(file);

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
