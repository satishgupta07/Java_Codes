//        Take as input N, a number. Take N more inputs and store that in an array.
//        Write a recursive function which inverses the array. Print the values of inverted array.

package Recursion_01;

import java.util.Arrays;

public class InverseArray {
    public static void main(String[] args) {
        int[] ar={4,2,0,1,3};
        int[] secondArr = new int[ar.length];
        inverse(ar,0, secondArr);
    }

    public static void inverse(int ar[], int i, int[] secondArr){

        if(i == ar.length) {
            System.out.println(Arrays.toString(secondArr));
            return;
        }
        int index = ar[i];
        secondArr[index] = i;
        inverse(ar, i+1,secondArr);

    }
}
