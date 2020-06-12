package Patterns;

import java.util.Scanner;

public class FiboTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int f = 0;
        int s = 1;
        for (int i = 0; i <=N; i++) {

            for (int j = 0; j < i ; j++) {
                System.out.print(f+" ");
                int t = f+s;
                f = s;
                s = t;
            }
            System.out.println();
        }
    }
}
