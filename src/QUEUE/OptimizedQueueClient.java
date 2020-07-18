package QUEUE;

public class OptimizedQueueClient {
    public static void main(String[] args) {
        OptimizedQueue queue2 = new OptimizedQueue();
        for(int i=1;i<=10; i++){
            queue2.enqueue(i);
            queue2.display();
        }
        System.out.println("FRONT : "+queue2.front());

        for (int i = 1; i <=5 ; i++) {
            queue2.dequeue();
            queue2.display();
        }

        System.out.println("FRONT : "+queue2.front());
    }
}
