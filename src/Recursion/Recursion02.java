package Recursion;

public class Recursion02 {
    public static void main(String[] args) {
//        coinToss(3,"");
//        climbingStairs(0,5,"");
        permutation("abc","");

    }

    public static void coinToss(int n, String ans) {
        if(n==0) {
            System.out.println(ans);
            return;
        }
        coinToss(n-1,ans+"H");
        coinToss(n-1,ans+"T");
    }

    public static void climbingStairs(int curr, int n, String ans) {
        //positive base case
        if(curr==n) {
            System.out.println(ans);
            return;
        }
        //negative base case
        if(curr>n) {
            return;
        }
        climbingStairs(curr+1,n,ans+"1");
        climbingStairs(curr+2,n,ans+"2");
        climbingStairs(curr+3,n,ans+"3");
    }

    public static void permutation(String ques, String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        for(int i=0; i<ques.length();i++) {
            String nq = ques.substring(0,i)+ques.substring(i+1);
            permutation(nq,ans+ques.charAt(i));
        }
    }
}
