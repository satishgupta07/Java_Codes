package Strings;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        pallindrome(str);
    }

    public static void pallindrome(String str) {
        int start = 0;
        int end = str.length()-1;

        while(start<=end){
            if(str.charAt(start) != str.charAt(end)){
                System.out.println("Not Pallindrome");
                return;
            }

            start++;
            end--;
        }
        System.out.println("Pallindrome");
    }
}
