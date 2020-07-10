package Recursion_03;

import java.util.Arrays;
import java.util.Scanner;

public class TrickyPermutations {
    public static void main(String args[]) {

        Scanner scn = new Scanner(System.in);

        String str = scn.next();

        char[] charray = str.toCharArray();                   // converts string into character array
        Arrays.sort(charray);

        permutationNoDuplicates(new String(charray), "");                         /* How to convert a char array back to a string? */
    }                                                                                 /* char[] a = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'}; */
                                                                                     /* String b = new String(a); */
    public static void permutationNoDuplicates(String ques, String ans) {

        if (ques.length() == 0) {
            System.out.println(ans);
            return;
        }

        for (int i = 0; i < ques.length(); i++) {

            char ch = ques.charAt(i);
            String roq = ques.substring(0, i) + ques.substring(i + 1);

            boolean flag = true;

            for (int j = i + 1; j < ques.length(); j++) {
                if (ques.charAt(j) == ch) {
                    flag = false;
                }
            }

            if (flag)
                permutationNoDuplicates(roq, ans + ch);
        }

    }
}
