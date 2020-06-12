package Basics_02;

import java.util.Scanner;

public class PrintArmstrongNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N1 = s.nextInt();
        int N2 = s.nextInt();
        while(N1<=N2){

            int sum = ArmstrongNumber.arm(N1);
            if(sum == N1){
                System.out.println(N1);
            }
            N1++;
        }
    }
}
