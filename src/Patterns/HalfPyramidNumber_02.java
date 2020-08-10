//    5
//        1
//        2 2
//        3 0 3
//        4 0 0 4
//        5 0 0 0 5

        package Patterns;

import java.util.Scanner;

public class HalfPyramidNumber_02 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();

        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(j==1 || i==j) {
                    System.out.print(i+" ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
