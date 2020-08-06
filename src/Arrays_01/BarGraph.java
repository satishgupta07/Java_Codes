package Arrays_01;

import static Arrays_01.Utils.maxvalue;

public class BarGraph {
    public static void main(String[] args) {
        int[] arr = {7,2,5,1,3,9} ;
        barGraph(arr);
    }

    public static void barGraph(int[] arr){
        int max = maxvalue(arr);
        int cols = arr.length;

        for (int row = 1; row <= max ; row++) {
            for (int col = 0; col < cols ; col++) {
                if(row <= max - arr[col]){
                    System.out.print("  ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
