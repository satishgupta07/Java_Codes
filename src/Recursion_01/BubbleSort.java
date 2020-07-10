package Recursion_01;

import Arrays_01.Utils;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        int[] ar = {5,6,3,4,2,1};

        bubblesort(ar, ar.length-1, 0);
        System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int[] ar, int row, int col) {
        if (row == 0) {
            return;
        }

        if (col == row) {
            bubblesort(ar, row - 1, 0);
            return;
        }

        if (ar[col] > ar[col + 1]) {
            Utils.swap(ar, col, col + 1);
        }
        bubblesort(ar, row, col + 1);
    }
}
