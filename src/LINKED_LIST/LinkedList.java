package LINKED_LIST;

import java.util.Stack;

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

    // Reverse LinkedList

    public void reverseData(){
        int left = 0;
        int right = size -1;

        while (left < right){
            Node ln = get(left);
            Node rn = get(right);

            int temp = ln.value;
            ln.value = rn.value;
            rn.value = temp;

            left++;
            right--;
        }
    }

    public void reversePointers(){
        Node prev = head;
        Node curr = prev.next;

        while (curr != null){
            Node ahead = curr.next;
            curr.next = prev;

            prev = curr;
            curr = ahead;
        }

        // swap
        Node t = head;
        head = tail;
        tail = t;

        tail.next = null;
    }

    public void reverse(){
        reverse(head);
    }

    private void reverse(Node node) {
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);

        tail.next = node;
        tail = node;
        tail.next = null;
    }


    public int mid(){
        Node slow = head;
        Node fast = head;

        while (fast.next!=null && fast.next.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public LinkedList merge(LinkedList first, LinkedList second) {
        Node f = first.head;
        Node s = second.head;

        LinkedList res = new LinkedList();

        while (f!=null && s!=null){
            if(f.value < s.value){
                res.insertlast(f.value);
                f = f.next;
            }
            else {
                res.insertlast(s.value);
                s = s.next;
            }
        }
        while (f!=null){
            res.insertlast(f.value);
            f=f.next;
        }
        while (s!=null){
            res.insertlast(s.value);
            s=s.next;
        }

        return res;
    }

    private Node midnode(){
        Node slow = head;
        Node fast = head;

        while (fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public LinkedList mergesort(LinkedList list){
        if(list.size == 1){
            return list;
        }
        Node mid = list.midnode();

        LinkedList first = new LinkedList();
        first.head = list.head;
        first.tail = mid ;
        first.size = (list.size+1)/2;

        LinkedList second = new LinkedList();
        second.head = mid.next;
        second.tail = tail;
        second.size = (list.size)/2;

        mid.next = null;

        first = mergesort(first);
        second = mergesort(second);

        return merge(first,second);
    }

    public LinkedList oddeven(LinkedList list) {
        LinkedList odd = new LinkedList();
        LinkedList even = new LinkedList();
        Node temp = list.head;
        while (temp != null) {
            if (temp.value % 2 == 0) {
                even.insertlast(temp.value);
            } else {
                odd.insertlast(temp.value);
            }
            temp = temp.next;
        }
        odd.tail.next = even.head;
        odd.tail = even.tail;
        return odd;
    }

    public void oddeven(){

        Node odd_head = null;
        Node odd_tail = null;

        Node even_head = null;
        Node even_tail= null;

        Node temp = head;

        while(temp!=null){

            if(temp.value % 2 != 0){

                if(odd_head==null){

                    odd_head= temp;
                    odd_tail=temp;
                }
                else{
                    odd_tail.next=temp;
                    odd_tail=temp;
                }
            }

            else{

                if(even_head==null){

                    even_head= temp;
                    even_tail=temp;
                }
                else{
                    even_tail.next=temp;
                    even_tail=temp;
                }
            }

            temp = temp.next;

        }

        odd_tail.next =even_head;
        head = odd_head;

        even_tail.next =null;
        tail =even_tail;
    }

    public int kthfromlast(int k){

        Node slow = head;
        Node fast = head;


        for (int i = 0; i <k; i++) {
            fast = fast.next;
        }

        while(fast!=null){

            slow = slow.next;
            fast = fast.next;
        }

        return slow.value;
    }

    public void kreverse(int k){

        Node prev = null;

        Stack<Node> stack = new Stack<>();

        Node temp= head;

        while(temp!=null){

            int cnt =1;

            while(temp!=null && cnt <k){

                stack.push(temp);
                temp =temp.next;
                cnt=cnt+1;
            }

            while (!stack.isEmpty()){

                if(prev == null){
                    prev = stack.pop();
                    head = prev;
                }

                else{

                    prev.next=stack.pop();
                    prev = prev.next;
                }
            }
        }

        prev.next=null;
        tail = prev;
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
