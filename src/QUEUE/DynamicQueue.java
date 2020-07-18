package QUEUE;

public class DynamicQueue extends CircularQueue {

    @Override
    public void enqueue(int element) {
        if(isFull()){

            int data[]=new int[2*ar.length];

            for (int i = 0; i <size ; i++) {
                data[i]=ar[(front+i)%ar.length];
            }
            front=0;
            ar=data;
            end=size;
        }
        super.enqueue(element);
    }
}
