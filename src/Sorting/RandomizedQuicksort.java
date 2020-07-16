package Sorting;

import Mathematics_01.ShuffleArray;

import java.util.Arrays;

public class RandomizedQuicksort {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};

        ShuffleArray.randomize(a);

        QuickSort.quickSort(a,0, a.length-1);

        System.out.println(Arrays.toString(a));
    }
}
