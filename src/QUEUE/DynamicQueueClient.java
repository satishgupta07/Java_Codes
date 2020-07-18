package QUEUE;

public class DynamicQueueClient {
    public static void main(String[] args) {

        DynamicQueue queue1 = new DynamicQueue();
        for (int i = 1; i <=20; i++) {
            queue1.enqueue(i);
            queue1.display();

        }

        for (int i = 1; i <=5 ; i++) {
            System.out.println(queue1.dequeue());
            queue1.display();

        }
    }
}
