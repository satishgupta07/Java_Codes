/*      Take as input N, the size of array. Take N more inputs and store that in an
        array.
        Take as input “target”, a number. Write a function which prints all pairs of
        numbers which sum to target.
        E.g. For this array => 3, 1, 9, 7, 5, -1 and target of 8 the output is -1 and 9, 1
        and 7, 3 and 5                */

package Arrays_02;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] ar = new int[N];
        for (int i = 0; i < ar.length ; i++) {
            ar[i] = sc.nextInt();
        }
        int target = sc.nextInt();

        targetsum(target, ar);
    }

    public static void targetsum(int target,int ar[]){
        for(int i=0;i<ar.length;i++){
            for(int j=i+1;j<ar.length;j++) {
                if (ar[i] + ar[j] == target) {
                    System.out.println(ar[i]+" and "+ar[j]);
                }
            }
        }

    }
}
