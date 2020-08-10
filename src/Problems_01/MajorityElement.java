package Problems_01;

import java.util.Arrays;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {7,2,7,3,7,2,7,7};

        findMajority(arr,arr.length);
        findmajorbin(arr);
        System.out.println();
        System.out.println(mooresAlgo(arr));
    }

    public static void findMajority(int arr[], int n) {
        int maxCount = 0;
        int index = -1;

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > maxCount) {
                maxCount = count;
                index = i;
            }
        }

        if (maxCount > n/2){
            System.out.println (arr[index]);
        }
        else {
            System.out.println ("No Majority Element");
        }

    }

    public static void findmajorbin(int[] arr){
        Arrays.sort(arr);
        int start = 0;
        int end = arr.length;

        int mid = (start+end)/2;
         int freq = 0;

        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == arr[mid]){
                freq++;
            }
        }

        if(freq>arr.length/2){
            System.out.print(arr[mid]);
        }
    }

    public static int mooresAlgo(int[] arr){
        int major = 0;
        int count = 1;

        for (int i = 1; i < arr.length ; i++) {
            if(arr[major]==arr[i]){
                count++;
            }
            else {
                count--;
            }
            if(count==0){
                major=i;
                count=1;
            }
        }
        return arr[major];
    }
}
