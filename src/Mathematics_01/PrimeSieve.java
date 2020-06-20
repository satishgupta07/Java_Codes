package Mathematics_01;

import java.util.Scanner;

public class PrimeSieve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        sieveOfEratosthenes(n);
    }

    public static void sieveOfEratosthenes(int n){
        boolean prime[] = new boolean[n+1];
        for (int i = 0; i < n; i++) {
            prime[i] = true ;
        }
        for (int p = 2; p*p <=n ; p++) {
            if(prime[p] == true){
                for (int i = p*p ; i <= n ; i = i + p) {
                     prime[i] = false;
                }
            }
        }

        for (int i = 2; i <= n ; i++) {
            if (prime[i] == true){
                System.out.print(i+", ");
            }
        }
    }
}
