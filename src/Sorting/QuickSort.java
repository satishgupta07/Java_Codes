package Sorting;

import Arrays_01.Utils;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {6,2,8,1,5,3};
        quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }

    public static void quickSort(int nums[],int start,int end){
        if(start>=end){
            return;
        }

        int p = pivot(nums,start,end);

        quickSort(nums,start,p-1);
        quickSort(nums,p+1,end);
    }

    public static int pivot(int[] nums,int start,int end){
        int j=start;
        for (int i = start; i <end ; i++) {
            if(nums[i]<nums[end]){
                Utils.swap(nums,i,j);
                j++;
            }
        }
        Utils.swap(nums,j,end);
        return j;
    }
}
