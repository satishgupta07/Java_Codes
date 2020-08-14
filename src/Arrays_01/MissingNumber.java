package Arrays_01;

import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = {1,2,7,5,4,3};
        System.out.println(getMissingNo(arr,arr.length));
    }

    public static int getMissingNo(int a[], int n) {
        int i, total;
        total = (n + 1) * (n + 2) / 2;
        for (i = 0; i < n; i++)
            total -= a[i];
        return total;
    }
}
