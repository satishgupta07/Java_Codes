package LINKED_LIST;

public class LinkedListClient {
    public static void main(String[] args) {
//        LinkedList list  = new LinkedList();
//
//        list.insertfirst(1);
//        list.insertfirst(2);
//        list.insertfirst(3);
//
//        list.insertlast(4);
//        list.insertlast(5);
//        list.insertlast(6);
//
//        list.display();
////
////        System.out.println(list.get(3));
////
////        System.out.println(list.deletefirst());
////
////        System.out.println(list.deletelast());
////
////        list.display();
////        System.out.println();
////
////        list.insertbetween(2,7);
////
////        list.display();
////        System.out.println();
////        System.out.println(list.deletebetween(3));
////
////        list.display();
////
////        list.insertfirst(8);
////        list.insertfirst(8);
////        System.out.println();
////        list.display();
////
////        list.removeduplicates();
////        System.out.println();
////        list.display();
////        System.out.println();
////        System.out.println(list.find(1));
////        System.out.println(list.find(9));
//
//        list.reverseData();
//        list.display();
//
//        list.reversePointers();
//        list.display();
//
//        list.reverse();
//        list.display();
//
//        System.out.println(list.mid());

//        LinkedList list1 = new LinkedList();
//        list1.insertlast(2);
//        list1.insertlast(8);
//        list1.insertlast(5);
//
//        LinkedList list2 = new LinkedList();
//        list2.insertlast(9);
//        list2.insertlast(7);
//        list2.insertlast(4);
//
//        LinkedList res = new LinkedList();
//        res = res.merge(list1,list2);
//        res.display();

        LinkedList list = new LinkedList();
        list.insertlast(2);
        list.insertlast(8);
        list.insertlast(4);
        list.insertlast(9);
        list.insertlast(5);
        list.insertlast(3);
        list.insertlast(1);
        list.insertlast(11);


        list.display();

        list = list.mergesort(list);
        list.display();

        list = list.oddeven(list);
        list.display();

        list.oddeven();
        list.display();

        System.out.println(list.kthfromlast(3));

        list.kreverse(3);
        list.display();
    }
}
