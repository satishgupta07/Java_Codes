package Arrays_01;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int ar[] = {8,2,5,3,7,1,9,6};

        bubblesort(ar);

        System.out.println(Arrays.toString(ar));
    }

    public static void bubblesort(int ar[]) {
        for (int i = 0; i <ar.length ; i++) {
            for (int j = 0; j < ar.length-i-1 ; j++) {
                if(ar[j] > ar[j+1]) {
                    Utils.swap(ar, j, j+1);
                }
            }
        }
    }
}
