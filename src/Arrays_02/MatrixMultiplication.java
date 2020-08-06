package Arrays_02;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] m1 = {{1,2},{2,4}};
        int[][] m2 = {{2,1},{1,3}};

        int[][] ans = matrixMultiplication(m1,m2);
        print2D(ans);
    }

    public static int[][] matrixMultiplication(int[][] m1, int[][] m2){
        int r1 = m1.length;
        int c1 = m1[0].length;

        int r2 = m2.length;
        int c2 = m2[0].length;

        int[][] ans = new int[r1][c2];

        for (int i = 0; i < ans.length ; i++) {
            for (int j = 0; j <ans[0].length ; j++) {
                int sum = 0;
                for (int k = 0; k < c1 ; k++) {
                    sum += m1[i][k]*m2[k][j];
                }
                ans[i][j] = sum ;
            }
        }
        return ans;
    }

    public static void print2D(int mat[][])
    {
        // Loop through all rows
        for (int[] row : mat)

            // converting each row as string
            // and then printing in a separate line
            System.out.println(Arrays.toString(row));
    }
}
