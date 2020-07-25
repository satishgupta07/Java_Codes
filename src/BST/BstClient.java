package BST;

public class BstClient {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

//        tree.insert(5);
//        tree.insert(9);
//        tree.insert(2);
//        tree.insert(7);
//        tree.insert(1);
//        tree.insert(4);
//
//        System.out.println("Pre-Order : ");
//        tree.preorder();
//
//        System.out.println("Successor : "+tree.successor(2));
//
//        System.out.print("In-Range : ");
//        tree.inrange(4,9);
//
//        System.out.println();
//        System.out.print("Sort : ");
//        tree.sort();

//          System.out.println();
//          int ar[]={1,2,3,4,5,6,7};
//          System.out.println("BST made from sorted array : ");
//          tree.makefromsorted(ar,0,ar.length-1);
//          tree.preorder();
//
//        System.out.print("Level-Order Traversal : ");
//        tree.levelorder();

        int pre[] = {5,3,2,4,6};
        int in[] ={2,3,4,5,6};

        tree.makefromprein(pre,in);
        tree.preorder();


    }
}
