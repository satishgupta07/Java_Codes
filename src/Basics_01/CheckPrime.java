package Basics_01;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i = 2;
        int flag = 0;
        while (i < num) {
            if (num % i == 0) {

                flag = 1;
                break;
            }
            i = i + 1;
        }

        if(flag==1){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }

    }
}
