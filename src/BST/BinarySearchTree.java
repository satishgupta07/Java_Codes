package BST;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree {
    private Node root;

    private class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value ;
        }
    }

    public void insert(int val){
        this.root = insert(root,val);
    }

    private Node insert(Node node, int val) {
        if(node == null){
            return new Node(val);
        }
        if(node.value > val){
            node.left = insert(node.left,val);
        }
        else {
            node.right = insert(node.right,val);
        }
        return node;
    }

    public void preorder(){
        preorder(root,"");
    }

    private void preorder(Node node, String indent){

        if(node==null){
            return;
        }

        System.out.println(indent+node.value);

        preorder(node.left,indent+"\t");
        preorder(node.right,indent+"\t");

    }

    public int successor(int value){
        Node current = root;
        Node success = null;

        while(current != null){
            if (current.value>value){
                if(success==null || success.value>current.value){
                    success = current;

                }
                current = current.left;
            }
            else{
                current = current.right;
            }

        }

        return success.value;
    }

    public void inrange(int k1, int k2){
        inrange(root,k1,k2);
    }

    public void inrange(Node node, int k1, int k2){

        if(node==null){
            return;
        }

        if(node.value>k1 &&node.value<k2){
            System.out.print(node.value+",");
        }


        if(node.value>k1){
            inrange(node.left,k1,k2);
        }

        if(node.value<k2){
            inrange(node.right,k1,k2);
        }

    }

    public void sort() {
        sort(root);

    }

    private void sort(Node node){
        if(node == null){
            return;
        }
        sort(node.left);
        System.out.print(node.value+" ");
        sort(node.right);
    }

    public void makefromsorted(int ar[],int start, int end){

        if(start>end){
            return;
        }

        int mid=(start+end)/2;

        insert(ar[mid]);

        makefromsorted(ar,start,mid-1);
        makefromsorted(ar,mid+1,end);
    }

    public void levelorder(){
        if(root == null){
            return;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.value+" ");

            if(temp.left != null){
                queue.add(temp.left);
            }

            if(temp.right != null){
                queue.add(temp.right);
            }
        }
    }
}
