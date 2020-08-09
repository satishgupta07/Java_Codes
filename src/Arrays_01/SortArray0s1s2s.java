package Arrays_01;

import java.util.Arrays;

public class SortArray0s1s2s {
    public static void main(String[] args) {
        int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };

        sortArr(arr);
    }

    static void sortArr(int arr[])
    {
        int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

        for (i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case 0:
                    cnt0++;
                    break;
                case 1:
                    cnt1++;
                    break;
                case 2:
                    cnt2++;
                    break;
            }
        }

        // Update the array
        i = 0;

        while (cnt0 > 0) {
            arr[i++] = 0;
            cnt0--;
        }

        while (cnt1 > 0) {
            arr[i++] = 1;
            cnt1--;
        }

        while (cnt2 > 0) {
            arr[i++] = 2;
            cnt2--;
        }

        System.out.println(Arrays.toString(arr));
    }

}
