//     4
//        1           1
//        1 2       2 1
//        1 2 3   3 2 1
//        1 2 3 4 3 2 1

        package Patterns;

import java.util.Scanner;

public class HillPatternNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int row = 1; row <=n ; row++) {
            int side=1;
            for (int col = 1; col <=(2*n)-1 ; col++) {
                if(side<=row){
                    System.out.print(side+" ");
                }
                else{
                    System.out.print("  ");
                }
                if(col<n){
                    side=side+1;
                }
                else{
                    side=side-1;
                }
            }
            System.out.println();
        }
    }
}
