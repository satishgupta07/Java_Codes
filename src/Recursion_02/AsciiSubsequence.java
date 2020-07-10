package Recursion_02;

public class AsciiSubsequence {
    public static void main(String[] args) {
        asciisubsequence("","abc");
    }

    public static void asciisubsequence(String processed, String unprocesseed) {
        if(unprocesseed.isEmpty()){
            System.out.println(processed);
            return;
        }

        char ch = unprocesseed.charAt(0);
        unprocesseed = unprocesseed.substring(1);

        asciisubsequence(processed+ch,unprocesseed);
        asciisubsequence(processed+(int)ch,unprocesseed);
        asciisubsequence(processed,unprocesseed);
    }
}
