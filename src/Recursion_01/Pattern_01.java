//    Take as input N, a number. Print the following pattern (for N = 5)
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *


package Recursion_01;

public class Pattern_01 {
    public static void main(String[] args) {
           pattern(5,0);
    }

    public static void pattern(int row,int col){
        if(row==0){
            return;
        }

        pattern(row-1,col);
        if(col==0) {

            System.out.println();
            pattern(row , col+1);
            return;
        }

        System.out.print("*");

    }
}
