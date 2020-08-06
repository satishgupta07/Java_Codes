//        Take as input S, a string. Write a function that returns the count of substrings
//        of this string which are palindromes. Print the value returned.

package STRINGS;

import java.util.Scanner;

public class CountSubStrPallindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(countpall(str));
    }

    public static int countpall(String str){
        String temp = "";
        StringBuffer stf;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {

                temp = str.substring(i, j);

                if (temp.length() >= 2) {
                    stf = new StringBuffer(temp);
                    stf.reverse();

                    if (stf.toString().compareTo(temp) == 0)                  /* String toString() is the built-in method of java.lang which return itself a string. So here no actual conversion is performed. Since toString() method simply returns the current string without any changes, there is no need to call the string explicitly, it is usually called implicitly.  */
                        count++;                                              /* The compareTo() method compares two strings lexicographically.
                                                                                 The comparison is based on the Unicode value of each character in the strings. */
                }
            }
        }

        return count;
    }
}

