//    5
//                1
//              2 3 2
//            3 4 5 4 3
//          4 5 6 7 6 5 4
//        5 6 7 8 9 8 7 6 5

        package Patterns;

import java.util.Scanner;

public class FullPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        while (row <= n){
            int space = 1;
            while (space <= n-row){
                System.out.print("  ");
                space = space + 1;
            }
            int col = 1;
            int var = row - 1;
            while(col <= (2*row - 1)) {
                if(col <= row){
                    var = var + 1;
                    System.out.print(var+" ");
                }
                else {
                    var = var - 1;
                    System.out.print(var+" ");
                }
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
