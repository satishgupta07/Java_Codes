//        Take as input N, a number. Print odd numbers in decreasing sequence (up until 0)
//        and even numbers in increasing sequence (up until N). E.g. for N = 6 print 5, 3, 1, 2, 4.


package Recursion_01;

import java.util.Scanner;

public class IncAndDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        oddeven(N);
    }

    private static void oddeven(int n) {
        if(n==0){
            return;
        }
        if(n%2!=0) {
            System.out.print(n+", ");  //decreasing
        }

        oddeven(n-1);

        if(n%2==0){
            System.out.print(n+", ");  //increasing
        }

    }
}
