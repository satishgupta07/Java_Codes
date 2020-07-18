package STACK;

public class DynamicStackClient {
    public static void main(String[] args) throws Exception {

        DynamicStack stack = new DynamicStack();
        for (int i = 1; i <=20 ; i++) {
            stack.push(i);
        }

        for (int i = 0; i <10 ; i++) {
            System.out.println(stack.pop());
        }
    }
}
