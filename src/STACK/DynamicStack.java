package STACK;

public class DynamicStack extends Stack {

    public void push(int element) {
        if(isFull()){
            int data[] = new int[2*ar.length];

            for (int i = 0; i <ar.length ; i++) {
                data[i] = ar[i];
                ar = data;
            }

        }
        super.push(element);
    }

}
