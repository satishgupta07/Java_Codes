package Sorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
//        int[] ar1={2,4,6};
//        int[] ar2={1,3,5};
//        int res[]= merge(ar1,ar2);
//        System.out.println(Arrays.toString(res));

        int ar[]={6,2,4,1,8,3};
        System.out.println(Arrays.toString(mergesort(ar)));
    }

    public static int[] mergesort(int ar[]){
        if(ar.length==1){
            return ar;
        }

        int mid = ar.length/2;
        int[] ar1 = Arrays.copyOfRange(ar,0,mid);
        int[] ar2 = Arrays.copyOfRange(ar,mid,ar.length);

        ar1 = mergesort(ar1);
        ar2 = mergesort(ar2);

        return merge(ar1,ar2);
    }

    public static int[] merge(int[] ar1,int[] ar2){
        int i=0;
        int j=0;
        int[] res = new int[ar1.length+ar2.length];
        int k=0;

        while(i<ar1.length && j<ar2.length){
            if(ar1[i]<ar2[j]){
                res[k] = ar1[i];
                k++;
                i++;
            }
            else {
                res[k] = ar2[j];
                k++;
                j++;
            }
        }

        while (i<ar1.length){
            res[k]=ar1[i];
            k++;
            i++;
        }

        while (j<ar2.length){
            res[k]=ar2[j];
            k++;
            j++;
        }
        return res;
    }
}
