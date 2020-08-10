//    4
//        *           *
//        * *       * *
//        * * *   * * *
//        * * * * * * *

        package Patterns;

import java.util.Scanner;

public class HillPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n = s.nextInt();

        int row =1 ;
        while(row<=n){
            int col =1;
            int sidemirror = 1;
            while(col<=2*n-1){
                if(sidemirror<=row){
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

            row=row+1;
            System.out.println();
        }
    }
}
