package Recursion_01;

import Arrays_01.Utils;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] ar = {3,8,2,9,4,1,6,5};
        selectionsort(ar,0);
    }

    public static void selectionsort(int ar[], int i){
        if(i == ar.length){
            System.out.println(Arrays.toString(ar));
            return;
        }

        int index = Utils.maxindex(ar,0,ar.length-i-1);
        Utils.swap(ar,index,ar.length-i-1);

        selectionsort(ar,i+1);
    }
}
