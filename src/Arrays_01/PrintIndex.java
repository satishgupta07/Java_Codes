//       Take as input N, the size of array. Take N more inputs and store that in an
//        array. Take as input a number M. Write a function which returns the index
//        on which M is found in the array, in case M is not found -1 is returned. Print
//        the value returned.


package Arrays_01;

import java.util.Scanner;

public class PrintIndex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = s.nextInt();
        }
        int M = s.nextInt();
        System.out.println(print(ar, M));
    }
    public static int print(int ar[],int M){

        for(int i=0;i<=ar.length-1;i++){
            if(ar[i]==M){
                return i;
            }

        }
        return -1;
    }
}
