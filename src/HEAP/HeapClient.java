package HEAP;

public class HeapClient {
    public static void main(String[] args) throws Exception {

        Heap heap = new Heap();
        heap.add(5);
        heap.add(3);
        heap.add(4);
        heap.add(2);
        heap.add(9);
        heap.add(7);
        heap.add(11);

        heap.display();

        System.out.println(heap.remove());

        heap.display();

    }
}
