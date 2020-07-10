//        Take as input S, a string. Write a function that inserts between each pair of
//        characters the difference between their ascii codes. Print the value returned.

package Strings;

import java.util.Scanner;

public class AsciiDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(diff_ascii(str));
    }

    public static String diff_ascii(String str){

        String ans = "";

        for(int i = 0;i < str.length() - 1;i++){

            ans += str.charAt(i);
            int diff = str.charAt(i + 1) - str.charAt(i);
            ans += diff;
        }

        ans += str.charAt(str.length() - 1);

        return ans;
    }
}
