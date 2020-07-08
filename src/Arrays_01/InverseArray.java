//        Take as input N, the size of array. Take N more inputs and store that in an
//        array.
//        Write a function that inverses the array. Print the values in inverted array.


package Arrays_01;

import java.util.Arrays;
import java.util.Scanner;

public class InverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = sc.nextInt();
        }
        inverse(ar);
    }

    public static void inverse(int ar[]){
        int[] secondArr = new int[ar.length];
        for(int i=0;i<ar.length;i++){

            int index = ar[i];

            secondArr[index] = i;
        }
        System.out.println(Arrays.toString(secondArr));
    }
}
