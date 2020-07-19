package LINKED_LIST;

public class LinkedList {

    private Node head;
    private Node tail;
    private int size = 0 ;

    private class Node {
        int value;
        Node next;

        private Node(int value){
            this.value = value;
        }
    }

    public void insertfirst(int element) {
        Node node = new Node(element);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }

    public void insertlast(int element){
        if(size == 0){
            insertfirst(element);
            return;
        }
        Node node = new Node(element);
        tail.next = node;
        tail = node;

        size++;
    }

    public int deletefirst() {
        if(size == 0){
            System.out.println("Khaali he yaar");
            return -1;
        }
        int temp = head.value;
        head = head.next;

        if(head == null ){
            tail =null;
        }
        size--;

        return temp;
    }

    public int deletelast(){

        if(size<2){
            return deletefirst();
        }

        Node temp = head;
        while(temp.next!=tail){
            temp = temp.next;
        }

        int del = temp.next.value;
        temp.next =null;
        tail = temp;
        size--;

        return del;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0; i <index ; i++) {
            temp = temp.next;
        }

        return temp;
    }

    public void insertbetween(int index, int element){

        if(index==0){
            insertfirst(element);
            return;
        }

        if(index ==size){
            insertlast(element);
            return;
        }

        Node prev = get(index - 1);

        Node node = new Node(element);
        node.next = prev.next;
        prev.next = node;

        size++;
    }

    public int deletebetween(int index) {

        if(index==0)
        {
            return deletefirst();
        }
        if(index==size-1)
        {
            return deletelast();
        }


        Node prev = get(index-1);
        int temp= prev.next.value;
        prev.next= prev.next.next;

        size--;
        return temp;
    }

    public void removeduplicates(){

        Node temp= head;

        while(temp.next!=null){

            if(temp.value==temp.next.value){
                temp.next=temp.next.next;
                size--;
            }
            else{
                temp=temp.next;
            }
        }

        tail=temp;
    }

    public Node find(int element){

        Node temp=head;

        while(temp!=null){

            if(temp.value==element){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }

    public void display(){

        Node temp = head;

        while(temp!=null){

            System.out.print(temp.value +"->");
            temp=temp.next;
        }

        System.out.println("null");
    }

}
