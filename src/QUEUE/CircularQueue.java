package QUEUE;

public class CircularQueue {
    public int ar[];
    public int DEFAULT_SIZE=10;
    public int front=0;
    public int size=0;

    public int end=0;

    public CircularQueue(){

        this.ar =new int[DEFAULT_SIZE];
    }

    public boolean isFull(){

        return size == ar.length;
    }

    public boolean enqueue(int element){

        if(isFull()){
            return false;
        }

        ar[end++]=element;
        end=end%ar.length;
        size++;
        return true;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int dequeue(){

        if(isEmpty()){
            System.out.println("Empty");
            return 0;
        }

        int temp = ar[front++];
        front = front%ar.length;
        size--;
        return temp;
    }

    public int front() {

        return ar[front];
    }

    public void display(){

        for (int i = 0; i <size ; i++) {
            System.out.print(ar[(front+i)%ar.length]+ " ");
        }

        System.out.println();
    }
}
