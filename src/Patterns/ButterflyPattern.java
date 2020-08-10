//    3
//        *       *
//        * *   * *
//        * * * * *
//        * *   * *
//        *       *

package Patterns;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int row = 1 ;
        int k=1;
        while(row<=2*n-1){
            int col =1;
            int sidemirror = 1;
            while(col<=2*n-1){
                if(sidemirror<=k){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                if(col<n){
                    sidemirror=sidemirror+1;
                }
                else{
                    sidemirror=sidemirror-1;
                }
                col=col+1;
            }
            if(row<n){
                k=k+1;
            }
            else {
                k=k-1;
            }
            row=row+1;
            System.out.println();
        }
    }
}
