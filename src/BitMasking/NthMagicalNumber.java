//        A magic number is defined as a number which can be expressed as a power of 5
//        or sum of unique powers of 5. First few magic numbers are 5, 25, 30(5 + 25), 125, 130(125 + 5), ….

//        If we notice carefully the magic numbers can be represented as 001, 010, 011, 100, 101, 110 etc,
//        where 001 is 0*pow(5,3) + 0*pow(5,2) + 1*pow(5,1). So basically we need to add powers of 5 for each bit set in given integer n.

package BitMasking;

import java.util.Scanner;

public class NthMagicalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         magic(n);
    }

    public static void magic(int n) {
        int res = 0;
        int place = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                res = (int) (res + Math.pow(5, place));

            }

            n = n >> 1;
            place = place + 1;
        }
        System.out.println(res);
    }
}
