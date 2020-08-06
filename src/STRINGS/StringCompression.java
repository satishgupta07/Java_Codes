//        Take as input S, a string. Write a function that does basic string compression.
//        Print the value returned. E.g. for input “aaabbccds” print out a3b2c2ds.

package STRINGS;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        compress(str);
    }

    public static void compress(String s) {
        int count = 1;

        char ch = s.charAt(0);

        StringBuilder output = new StringBuilder();

        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == ch){
                count++;
            }else{
                if(count > 1){
                    output.append(""+ch+count);
                }else{
                    output.append(ch);
                }
                count = 1;
                ch = s.charAt(i);
            }
        }
        if(count > 1){
            output.append(""+ch+count);
        }else{
            output.append(ch);
        }
        System.out.println(output.toString());
    }
}
