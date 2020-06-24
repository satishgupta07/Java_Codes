package Arrays_01;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int ar[] = {7,2,5,1,9,8,3};

        insertsort(ar);

        System.out.println(Arrays.toString(ar));
    }
    public static void insertsort(int ar[]){
        for (int i = 0; i <ar.length-1 ; i++) {
            for (int j = i+1; j > 0 ; j--) {
                if(ar[j] < ar[j-1]){
                    Utils.swap(ar, j, j-1);
                }
                else{
                    break;
                }

            }
        }
    }
}
