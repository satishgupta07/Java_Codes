package Recursion_02;

public class Skip {
    public static void main(String[] args) {
           skip("","skip");
    }

    public static void skip(String processed, String unprocessed) {
        if(unprocessed.isEmpty()) {
            System.out.println(processed);
            return;
        }

        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);

        if(ch == 'i') {
            skip(processed,unprocessed);
            return;
        }

        skip(processed+ch,unprocessed);
    }
}
