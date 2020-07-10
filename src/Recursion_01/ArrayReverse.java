//        Take as input N, a number. Take N more inputs and store that in an array.
//        Write a recursive function which reverses the array. Print the values of reversed array.

package Recursion_01;

import Arrays_01.Utils;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] ar={5,4,3,2,1};
        reverse(ar,0,ar.length-1);
        System.out.println(Arrays.toString(ar));
    }

    public static void reverse(int ar[],int start, int end){
        if(start==end){
            return;
        }
        Utils.swap(ar, start, end);

        reverse(ar,start+1,end-1);
    }
}
