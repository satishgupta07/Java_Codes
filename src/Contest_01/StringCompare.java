/* Write a program that can determine whether the characters in the first string 'X' can be rearranged
   to form the second string 'Y'. The output should be "yes" if htis is possible and "no" if not   */


package Contest_01;

import java.util.Arrays;
import java.util.Scanner;

public class StringCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String X = sc.next();
        String Y = sc.next();

        if (comparestring(X, Y))
            System.out.println("yes");
        else
            System.out.println("no");
    }


    public static boolean comparestring(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();

        if (n1 != n2) {
            return false;
        }

        char tempArray1[] = str1.toCharArray();
        Arrays.sort(tempArray1);

        char tempArray2[] = str2.toCharArray();
        Arrays.sort(tempArray2);



        for (int i = 0; i < n1; i++)
            if (tempArray1[i] != tempArray2[i]) {
                return false;
            }
        return true;
    }
}
