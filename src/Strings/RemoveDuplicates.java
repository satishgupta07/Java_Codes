//        Take as input S, a string. Write a function that removes all consecutive duplicates.
//        Print the value returned. E.g. for input "aabccba" print "abcba".

package Strings;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(remove(str));
    }

    public static String remove(String s) {
        String result = "";

        for (int i = 0; i < s.length(); i++){
            if (i + 1 < s.length() && s.charAt(i) != s.charAt(i+1)){
                result = result + s.charAt(i);
            }
            if (i + 1 == s.length()){
                result = result + s.charAt(i);
            }
        }

        return result;

    }
}
