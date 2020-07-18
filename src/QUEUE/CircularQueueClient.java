package QUEUE;

public class CircularQueueClient {
    public static void main(String[] args) {
        CircularQueue queue1 = new CircularQueue();
        for (int i = 1; i <=7 ; i++) {
            queue1.enqueue(i);
            queue1.display();

        }
        System.out.println("FRONT : "+queue1.front());
        for (int i = 1; i <=5 ; i++) {
            System.out.println(queue1.dequeue());
            queue1.display();

        }
        System.out.println("FRONT : "+queue1.front());
    }
}
