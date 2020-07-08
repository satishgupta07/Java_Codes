package Strings;

import java.util.Scanner;

public class MaxFreqCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        System.out.println(getMaxOccuringChar(str));
    }
    
    static final int ASCII_SIZE = 256;
    public static char getMaxOccuringChar(String str) {
        int count[] = new int[ASCII_SIZE];
        
        int max = -1;
        char result = ' ';

        for (int i = 0; i < str.length() ; i++) {
            count[str.charAt(i)]++;

            if(max < count[str.charAt(i)]) {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        return result;
    }
}
