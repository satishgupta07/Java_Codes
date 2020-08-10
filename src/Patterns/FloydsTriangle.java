//    5
//        1
//        2 3
//        4 5 6
//        7 8 9 10
//        11 12 13 14 15

        package Patterns;

import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 1;
        int count = 1;
        while (row <= n){
            int col = 1;
            while (col <= row){
                System.out.print(count+" ");
                count = count + 1;
                col = col + 1;
            }
            System.out.println();
            row = row + 1;
        }
    }
}
