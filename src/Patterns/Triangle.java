//     4
//              *
//            * * *
//          * * * * *
//        * * * * * * *

package Patterns;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int row = 1; row <= n ; row++) {
            int space = 1;
            while(space <= n - row){
                System.out.print("  ");
                space = space + 1;
            }
            for (int col = 1; col <= (2*row - 1) ; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
