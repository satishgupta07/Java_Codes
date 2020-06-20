package Basics_02;

import java.util.Scanner;

public class LogXbaseN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int N = sc.nextInt();

        System.out.println(log(X, N));
    }

    public static int log(int X, int N){
        return (int)(Math.log(X)/Math.log(N));
    }
}
