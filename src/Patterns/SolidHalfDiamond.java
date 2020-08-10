//    4
//        *
//        * *
//        * * *
//        * * * *
//        * * *
//        * *
//        *

package Patterns;

import java.util.Scanner;

public class SolidHalfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;
        int row = 1;
        while(k <= 2*n-1) {
            int col = 1;
            while (col <= row){
                System.out.print("* ");
                col = col + 1 ;
            }
            if(k<n){
                row = row + 1;
            }
            else {
                row = row - 1;
            }
            k=k+1;
            System.out.println();
        }
    }
}
