/* Take as input a character ch. Write a function that returns ‘U’, if it is uppercase;
   ‘L’ if it is lowercase and ‘I’ otherwise. Print the value returned.
 */

package Function;

import java.util.Scanner;

public class Problem_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        check(ch);
    }

    public static void check(char ch) {

        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("U");
        }
        else if (ch >= 'a' && ch <= 'z'){
            System.out.println("L");
        }
        else {
            System.out.println("I");
        }
    }
}
