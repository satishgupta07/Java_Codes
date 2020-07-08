//Take as input S, a string. Write a function that toggles the case of all characters in the string. Print the value returned.


package Strings;

import java.util.Scanner;

public class Toggles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        convert(str);
    }

    public static void convert(String s){
        StringBuilder builder = new StringBuilder(s);
        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch>='A'&& ch<='Z') {
                ch = (char)('a' +(ch-'A'));
            }
            else{
                ch=(char)('A'+(ch-'a'));
            }
            builder.setCharAt(i,ch);
        }
        System.out.println(builder);
    }
}
