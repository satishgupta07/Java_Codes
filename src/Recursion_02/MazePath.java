package Recursion_02;

public class MazePath {
    public static void main(String[] args) {
         maze("",3,3);
    }

    public static void maze(String processed, int row , int col) {
        if(row == 1 && col == 1) {
            System.out.println(processed);
            return;
        }

        if(row > 1) {
            maze(processed+"R",row-1,col);
        }
        if(col >1 ){
            maze(processed+"C",row,col-1);
        }
    }
}
