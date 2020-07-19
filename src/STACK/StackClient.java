package STACK;

public class StackClient {
    public static void main(String[] args) throws Exception {

        Stack stack = new Stack();

        for (int i = 1; i <=10 ; i++) {
            stack.push(i);
        }

        System.out.println("Stack Peek Element : " + stack.peek());
        stack.display();

        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println(stack.pop());
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("finally block is always executed whether exception is handled or not");
        }
        stack.display();
    }
}
