package Basics_01;

import java.util.Scanner;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        printprimenumbers(num);

    }

    public static void printprimenumbers(int num) {
        for (int n = 2; n <= num ; n++) {
            int flag =0;
            for (int i = 2; i <n ; i++) {
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(n);
            }
        }
    }
}
