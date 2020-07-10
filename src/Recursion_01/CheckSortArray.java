//        Take as input N, the size of array. Take N more inputs and store that in an array.
//        Write a recursive function which returns true if the array is sorted and false otherwise.
//        Print the value returned.

package Recursion_01;

public class CheckSortArray {
    public static void main(String[] args) {
        int ar[] = {3,5,6,7};
        System.out.println(isSorted(ar, 0));
    }

    public static boolean isSorted(int[] a, int i) {
        if(i == a.length-1){
            return true;
        }
        if (a[i] > a[i+1]) {
            return false;
        }

       return isSorted(a,i+1);
    }
}
