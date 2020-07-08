//        Take as input N, the size of array. Take N more inputs and store that in an
//        array. Write a function which returns the maximum value in the array. Print
//        the value returned.

package Arrays_01;

public class MaxInArray {
    public static void main(String[] args) {
        int[] ar = {3,1,9,4,7,2,8};

        System.out.println(max(ar));
    }

    public static int max(int ar[]){
        int max = ar[0];
        for (int i = 0; i<ar.length-1 ; i++) {

            if(max < ar[i+1]){
                max = ar[i+1];
            }

        }
        return max;

    }
}
