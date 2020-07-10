//        Take as input N, the size of array. Take N more inputs and store that in an array.
//        Take as input M, a number. Write a recursive function which returns an array
//        containing indices of all items in the array which have value equal to M. Print all the values in the returned array.

package Recursion_01;

import java.util.Arrays;
import java.util.Scanner;

public class AllIndixes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ar[]={2,3,4,7,3,8,2,5,3,8};
        int M = sc.nextInt();
//        System.out.println(Arrays.toString(allindices(ar,0,M,0)));
        allindices(ar,0,M,0);
    }

    public static int[] allindices(int ar[],int si,int data,int count){
        if(si == ar.length){
            int[] base = new int[count];
            return base;
        }
        int[] indices = null;
        if(ar[si] == data) {
            indices = allindices(ar,si+1,data,count+1);
        }
        else {
            indices = allindices(ar,si+1,data,count);
        }
        if(ar[si]==data) {
            indices[count]=si;
        }
        return indices;
    }
}
