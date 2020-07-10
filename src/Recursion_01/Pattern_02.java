//        Take as input N, a number. Print the following pattern (for N = 5)
//        * * * * *
//        * * * *
//        * * *
//        * *
//        *


package Recursion_01;

public class Pattern_02 {
    public static void main(String[] args) {
           pattern(5,0);
    }

    public static void pattern (int row, int col) {
        if(row==0){
            return;
        }
        if(col==row){

            System.out.println();
            pattern(row-1,0);
            return;
        }
        System.out.print("*");
        pattern(row,col+1);
    }
}
