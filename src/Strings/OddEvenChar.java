//        Take as input S, a string. Write a function that replaces every odd
//        character with the character having just higher ascii code and every even
//        character with the character having just lower ascii code. Print the value returned.


package Strings;

import java.util.Scanner;

public class OddEvenChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        change(str);
    }

    public static void change(String s){
        String result="";

        for (int i = 0; i <s.length() ; i++) {
            char ch = s.charAt(i);
            if( (i+1) %2==0){
                ch = (char)(ch-1);
                result =result+ch;
            }
            else{
                ch=(char)(ch+1);
                result = result+ch;
            }
        }
        System.out.println(result);
    }
}
