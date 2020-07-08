//        Take as input N, the size of array. Take N more inputs and store that in an
//        array.
//        Write a function that returns true if the array is mirror-inverse and false
//        otherwise.

package Arrays_01;

import java.util.Scanner;

public class MirrorInverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i <ar.length ; i++) {
            ar[i] = sc.nextInt();
        }
       mirrorinv(ar);
    }

    public static void mirrorinv(int ar[]){
        int[] secondArr = new int[ar.length];
        for(int i=0;i<ar.length;i++){
            int index = ar[i];
            secondArr[index] = i;
        }

        for (int i = 0; i <ar.length ; i++) {
            if(ar[i] != secondArr[i]){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
