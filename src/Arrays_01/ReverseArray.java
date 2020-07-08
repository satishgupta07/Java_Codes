//        Take as input N, the size of array. Take N more inputs and store that in an
//        array.
//        Write a function that reverses the array. Print the values in reversed array.


package Arrays_01;

import java.util.Arrays;
import java.util.Scanner;

import static Arrays_01.Utils.swap;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = scn.nextInt();
        }
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }

    public static void reverse(int ar[] ,int start, int end){

        while(start<=end){

            swap(ar,start,end);

            start++;
            end--;
        }
    }
}
