package QUEUE;

public class QueueClient {
    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 9; i++) {
            queue.enqueue(i);
            queue.display();
        }

        System.out.println("Queue Front Element : "+ queue.front());

        for (int i = 0; i < 9; i++) {
            queue.dequeue();
            queue.display();
        }
    }
}
