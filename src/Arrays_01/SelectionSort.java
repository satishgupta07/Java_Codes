package Arrays_01;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int ar[] = {4,5,10,2,15,9,7,18};
        selectsort(ar);
        System.out.println(Arrays.toString(ar));
    }

    public static void selectsort(int ar[]){
        for (int i = 0; i < ar.length ; i++) {
            int index = Utils.maxindex(ar,0,ar.length-i-1);
            Utils.swap(ar,index,ar.length-i-1);
        }
    }
}
