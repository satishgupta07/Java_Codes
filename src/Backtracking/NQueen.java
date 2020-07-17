package Backtracking;

public class NQueen {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        nqueen(board,0);
    }

    public static void print(boolean[][] board){
        for (int i = 0; i <board.length ; i++) {

            for (int j = 0; j <board[i].length ; j++) {

                if(board[i][j]){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void nqueen(boolean[][] board,int row){

        if(row==board.length){
            print(board);                    // calling print function
            return;
        }

        for (int col = 0; col <board.length ; col++) {

            if(issafe(board,row,col)){

                board[row][col]=true;
                nqueen(board,row+1);
                board[row][col]=false;
            }
        }
    }

    private static boolean issafe(boolean[][] board, int row, int col) {

        /* Check the row on left side */
        for (int i = 0; i <row ; i++) {
            if(board[i][col]){
                return false;
            }
        }

        /* Check upper diagonal on left side */
        int left= Math.min(row,col);
        for (int i = 1; i <=left ; i++) {
            if(board[row-i][col-i]){
                return false;
            }
        }

        /* Check lower diagonal on left side */
        int right= Math.min(row,board.length-col-1);
        for (int i = 1; i <=right ; i++) {
            if(board[row-i][col+i]){
                return false;
            }
        }
        return true;
    }
}