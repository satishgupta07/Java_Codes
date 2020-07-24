package GENERICTREE;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class GenericTree {
    private Node root;

    public class Node{
        private int value;
        private ArrayList<Node> children;

        public Node(int value){
            this.value = value;
            this.children = new ArrayList<>();
        }
    }

    public void insert(Scanner s){

        System.out.println("Enter the value for root : ");
        int val =s.nextInt();
        this.root =new Node(val);
        insert(root,s);
    }

    private void insert(Node node, Scanner s) {

        while (true){

            System.out.println("Do you want to add child of "+ node.value);
            boolean yes = s.nextBoolean();

            if(yes){
                System.out.println("Enter the value for children");
                int val = s.nextInt();
                Node child = new Node(val);
                node.children.add(child);
                insert(child,s);
            }

            else{
                break;
            }
        }
    }

    public void display(){
        display(root,"");
    }

    private void display(Node node, String indent) {
        System.out.println(indent+node.value);

        for (int i = 0; i < node.children.size() ; i++) {
            display(node.children.get(i),indent+"\t");
        }
    }

    public int count(){
        return count(root);
    }

    private int count(Node node) {

        int cnt = 1;

        for (int i = 0; i <node.children.size() ; i++) {
            cnt+= count(node.children.get(i));
        }
        return cnt;
    }

    public int max(){

        int max=root.value;
        return max(root,max);
    }

    private int max(Node node, int max) {

        if(max<node.value){
            max=node.value;
        }

        for (int i = 0; i <node.children.size(); i++) {
            max= max(node.children.get(i),max);
        }
        return max;
    }

    public void postorder(){
        postorder(root);
    }
    private void postorder(Node node){
        for (int i = 0; i < node.children.size() ; i++) {
            postorder(node.children.get(i));
        }
        System.out.print(node.value+",");
    }

    public void depth(int k){
        depth(root,k);
    }

    private void depth(Node node, int k) {
        if(node==null){
            return;
        }
        if(k==0){
            System.out.println(node.value);
            return;
        }
        for (int i = 0; i < node.children.size() ; i++) {
            depth(node.children.get(i),k-1);
        }
    }

    public int heigth(){
        return heigth(root);
    }

    private int heigth(Node node) {
        int maxheight = 0;
        for (int i = 0; i < node.children.size() ; i++) {
            int height = heigth(node.children.get(i));
            maxheight = Math.max(maxheight,height);
        }
        return 1+maxheight;
    }

    public void levelorder(){
        levelorder(root);
    }

    private void levelorder(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            Node temp = queue.remove();
            System.out.print(temp.value+",");
            for (int i = 0; i < temp.children.size() ; i++) {
                Node child = temp.children.get(i);
                queue.add(child);
            }
        }
    }
}
