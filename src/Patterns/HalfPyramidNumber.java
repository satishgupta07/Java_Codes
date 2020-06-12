package Patterns;

import java.util.Scanner;

public class HalfPyramidNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int c = 1;
        for (int i = 0; i <= N ; i++) {
            for (int j = 0; j < i ; j++) {
                System.out.print(c+" ");
                c++;
            }
            System.out.println();
        }
    }
}
