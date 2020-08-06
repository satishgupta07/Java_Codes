package STRINGS;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;

        String str = scn.next();

        substr(str);
    }

    public static void substr(String str) {
        for (int i = 0; i <str.length(); i++) {

            for (int j = i+1; j <=str.length() ; j++) {

                System.out.println(str.substring(i,j));

            }
        }
    }
}
