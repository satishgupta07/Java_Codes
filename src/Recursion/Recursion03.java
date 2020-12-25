package Recursion;

import java.util.ArrayList;
import java.util.List;

public class Recursion03 {
    public static void main(String[] args) {
//        mazePath(0,0,2,2,"");
//        mazePathDiagonal(0,0,2,2,"");
//        validParenthesis(3,0,0,"");
        List<String> list = new ArrayList<String>();
        validParenthesis01(3,0,0,"",list);
        System.out.println(list);
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

    public static void validParenthesis(int n, int open, int close, String ans) {
        if(open==n && close==n) {
            System.out.println(ans);
            return;
        }
        if(open>n || close>open) {
            return;
        }
        validParenthesis(n, open+1, close, ans+"{");
        validParenthesis(n,open,close+1,ans+"}");
    }

    public static void validParenthesis01(int n, int open, int close, String ans, List<String> list) {
        if(open==n && close==n) {
            list.add(ans);
            return;
        }
        if(open>n || close>open) {
            return;
        }
        validParenthesis01(n, open+1, close, ans+"{", list);
        validParenthesis01(n,open,close+1,ans+"}", list);
    }
}
