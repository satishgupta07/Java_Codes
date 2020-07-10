package Recursion_01;

import java.util.Arrays;

public class NthTriangle {
    public static void main(String[] args) {

        System.out.println(seriesSum(6,0,0));
    }

    public static int seriesSum(int n, int i, int sum) {
        if(i > n) {
            return sum;
        }

        return seriesSum(n,i+1,sum+i);

    }
}
