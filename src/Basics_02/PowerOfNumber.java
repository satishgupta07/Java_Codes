package Basics_02;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(powofno(x,n));
    }
    public static int powofno(int x, int n){
        int result=1;
        while(n!=0){
            result = result*x;
            n--;
        }
        return result;
    }
}
