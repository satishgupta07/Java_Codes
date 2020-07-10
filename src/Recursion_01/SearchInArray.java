//        Take as input N, the size of array. Take N more inputs and store that in an array.
//        Take as input M, a number. Write a recursive function which returns true if M
//        is contained in the array and false otherwise. Print the value returned.

package Recursion_01;

import java.util.Scanner;

public class SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[] = {2,4,6,8,3,9};
        int M = sc.nextInt();

        System.out.println(search(ar,M,0));
    }

    public static boolean search(int[] ar, int M, int i) {
        if(i == ar.length) {
            return false;
        }

        if(ar[i] == M){
            return true;
        }

        return search(ar,M,i+1);
    }
}
