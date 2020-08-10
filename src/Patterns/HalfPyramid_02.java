//       5
//            *
//           **
//          ***
//         ****
//        *****

package Patterns;

import java.util.Scanner;

public class HalfPyramid_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for (int row = 1 ; row <= N ; row++) {
            for (int space = N-1; space >= row ; space--) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
