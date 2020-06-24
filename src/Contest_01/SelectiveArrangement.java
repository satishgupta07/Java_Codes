/*  NUMBER OF SELECTIVE ARRANGEMENTS  */
/*  Given a number of objects N (non-repetitive object). Find the number of arrangements
    in which no object occurs at its original position.  */

package Contest_01;

import java.util.Scanner;

public class SelectiveArrangement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(arrangement(n));
    }

    public static int arrangement(int n) {

        if (n == 1) return 0;
        if (n == 0) return 1;
        if (n == 2) return 1;

        return (n - 1) * (arrangement(n - 1) + arrangement(n - 2));
    }
}
