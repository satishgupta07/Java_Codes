package Arrays_01;

import java.util.Arrays;

public class PushZeroesAtEnd {
    public static void main(String[] args) {
        int arr[] = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};

        pushZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void pushZerosToEnd(int[] arr){
        int count = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] != 0){
                arr[count++] = arr[i];
            }
        }
        while(count < arr.length){
            arr[count++] = 0;
        }
    }
}
