package Basics_01;

import java.util.Scanner;

public class NthFibonacciNumber {
    public static void main(String[] args) {

        int f=0, s=1;
        Scanner obj = new Scanner(System.in);
        int n=obj.nextInt();

        while(n>0){
            int t=f+s;
            f=s;
            s=t;
            n=n-1;
        }
        System.out.println(f);
    }
}
