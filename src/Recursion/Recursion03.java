package Recursion;

public class Recursion03 {
    public static void main(String[] args) {
//        mazePath(0,0,2,2,"");
        mazePathDiagonal(0,0,2,2,"");
    }

    public static void mazePath(int cr, int cc, int er, int ec, String ans) {
        if(cr==er && cc==ec) {
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec) {
            return;
        }
        mazePath(cr, cc+1, er, ec, ans+"H");
        mazePath(cr+1, cc, er, ec, ans+"V");
    }

    public static void mazePathDiagonal(int cr, int cc, int er, int ec, String ans) {
        if(cr==er && cc==ec) {
            System.out.println(ans);
            return;
        }
        if(cr>er || cc>ec) {
            return;
        }
        mazePathDiagonal(cr, cc+1, er, ec, ans+"H");
        mazePathDiagonal(cr+1, cc, er, ec, ans+"V");
        mazePathDiagonal(cr+1, cc+1, er, ec, ans+"D");
    }
}
