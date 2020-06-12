package Patterns;

import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int line = 1; line <=n ; line++) {
            int c =1;
            for (int i = 1; i <=line ; i++) {
                System.out.print(c+" ");
                c = c*(line-i)/i;
            }
            System.out.println();
        }
    }
}
