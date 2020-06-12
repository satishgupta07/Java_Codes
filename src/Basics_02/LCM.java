package Basics_02;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N1=s.nextInt();
        int N2=s.nextInt();
        System.out.println(lcm(N1,N2));
    }
    public static int  lcm(int N1,int N2){
        int gcd = GCD.hcf(N1,N2);
        int lcm = (N1*N2)/gcd;
        return lcm;
    }
}
