package Recursion;

public class PalindromicPartitioning {
    public static void main(String[] args) {
        pallindromicPartition("nitin","");
    }

    public static void pallindromicPartition(String ques, String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for (int i=1; i<=ques.length(); i++) {
            String roq = ques.substring(i);
            String comp = ques.substring(0,i);
            if(ispallindrome(comp)) {
                pallindromicPartition(roq, ans + comp + " ");
            }
        }
    }

    public static boolean ispallindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        while(start<end) {
            if(str.charAt(start)!=str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
