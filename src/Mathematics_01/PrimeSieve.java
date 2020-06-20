package Mathematics_01;

import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        isPrime(num);
    }

    public static boolean isPrime(int num){
        if(num <= 0){
            return false;
        }
        if(num == 1){
            return false;
        }
        if((num & 1) == 0){
            return false;
        }

        boolean isPrime = true;
        for (int i = 3; i*i <= num ; i+=2) {
            if(num % i == 0){
                isPrime = false;
            }
        }
        return isPrime;
    }
}
