// Take as input S, a string. Write a function that prints all its subsequences.

package STRINGS;

import java.util.Scanner;

public class Subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        subsequence(str);
    }

    public static void subsequence(String str) {
        for (int i = 0; i <str.length(); i++) {

            for (int j = i+1; j <=str.length() ; j++) {

                System.out.println(str.subSequence(i,j));

            }
        }
    }
}
