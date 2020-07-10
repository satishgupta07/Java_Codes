//        Take as input N, a number. Take N more inputs and store that in an array.
//        Write a recursive function which tests if the array is a palindrome and returns a Boolean value.
//        Print the value returned.

package Recursion_01;

public class Pallindrome {
    public static void main(String[] args) {
        int ar[]={1,2,3,2,1};
        System.out.println(pallindrome(ar,0,ar.length-1));
    }

    public static boolean pallindrome(int ar[], int start, int end){
        if(ar[start] != ar[end]) {
            return false;
        }

        if(start >= end ){
            return true;
        }

        return pallindrome(ar,start+1,end-1);
    }
}
