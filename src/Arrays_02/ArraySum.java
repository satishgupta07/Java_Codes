package Arrays_02;

import java.util.ArrayList;

public class ArraySum {
    public static void main(String[] args) {
        int[] one = { 1, 2, 3, 4, 5, 6, 6, 6, 7, 8 };
        int[] two = { 5, 6, 6, 8, 8, 8, 10 };

        System.out.println(sum2Arrays(one, two));
    }

    public static ArrayList<Integer> sum2Arrays(int[] one, int[] two) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = one.length - 1;
        int j = two.length - 1;

        int carry = 0;

        while (i >= 0 || j >= 0) {

            int sum = carry;

            if (i >= 0)
                sum += one[i];

            if (j >= 0)
                sum += two[j];

            int ld = sum % 10;
            carry = sum / 10;

            list.add(0, ld);

            i--;
            j--;

        }

        if (carry != 0)
            list.add(0, carry);

        return list;

    }
}
