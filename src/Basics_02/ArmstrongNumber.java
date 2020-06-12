package Basics_02;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num=s.nextInt();

        int sum = arm(num);

        if(sum==num){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
    }

    public static int order(int num){
        int i=0;
        while (num!=0){
            i++;
            num=num/10;
        }
        return i;
    }

    public static int arm(int num){
        int i = order(num);
        int sum=0;
        while(num!=0){
            int r=num%10;
            sum = sum + (int)Math.pow(r,i);
            num = num/10;
        }
        return sum;
    }
}
