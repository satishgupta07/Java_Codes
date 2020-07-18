package QUEUE;

public class CircularQueue {

    protected int DEFAULT_SIZE=10;

    protected int end;
    protected int[] ar;
    protected int front;
    protected int size;

    public CircularQueue(){
        this.ar =new int[DEFAULT_SIZE];
        this.end = 0;
        this.front = 0;
        this.size = 0;
    }

    public boolean isFull(){

        return size == ar.length;
    }

    public void enqueue(int element){
        if(isFull()){
            return;
        }

        ar[end++]=element;
        end= end %ar.length;
        size++;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int dequeue(){

        if(isEmpty()){
            System.out.println("Empty");
            return -1;
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
