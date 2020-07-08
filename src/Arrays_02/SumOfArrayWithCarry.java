//        Take as input N, the size of array. Take N more inputs and store that in an
//        array.
//        Take as input M, the size of second array and take M more inputs and
//        store that in second array. Write a function that returns the sum of two
//        arrays. Print the value returned.
//        E.g. Sum of [1, 0, 2, 9] and [3, 4, 5, 6, 7] is [3, 5, 5, 9, 6]

package Arrays_02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SumOfArrayWithCarry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N :");
        int N = sc.nextInt();
        int[] ar1 = new int[N];
        for (int i = 0; i < ar1.length ; i++) {
            ar1[i] = sc.nextInt();
        }
        System.out.println("First Array" + Arrays.toString(ar1));

        System.out.println("M :");
        int M = sc.nextInt();
        int[] ar2 = new int[M];
        for (int i = 0; i <ar2.length ; i++) {
            ar2[i] = sc.nextInt();
        }
        System.out.println("Second Array" + Arrays.toString(ar2));

        System.out.println("Sum of two array is :");
        sum(ar1,ar2);
    }

    public static void sum(int ar1[], int ar2[]){
        ArrayList list = new ArrayList();
        int i = ar1.length-1;
        int j = ar2.length-1;
        int carry = 0;

        while(i>=0 && j>=0){
            int temp = ar1[i] + ar2[j] + carry;
            if(temp>=10){
                int r = temp % 10;
                list.add(0,r);
                carry = temp/10;
            }
            else{
                list.add(0,temp);
                carry = 0;
            }
            j--;
            i--;
        }
        if(i<0 && j>=0){
            while (j>=0){
                list.add(0,ar2[j]+carry);
                carry = 0;
                j--;
            }
        }
        else if(j<0 && i>=0){
            while(i>=0){
                list.add(0,ar1[i]+carry);
                carry = 0;
                i--;
            }
        }
        else {
            list.add(0,carry);
        }

        Object[] objects = list.toArray();          /* The toArray() method is used to get an array which contains all the elements
                                                        in ArrayList object in proper sequence (from first to last element). */

        for (Object obj : objects) {
            System.out.print(obj + ", ");
        }

    }
}
