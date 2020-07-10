package Recursion_02;

import java.util.ArrayList;

public class MazePathList {
    public static void main(String[] args) {
        System.out.println(mazepath("",3,3));
    }

    public static ArrayList mazepath(String processed, int row, int col) {
        if(row == 0 && col == 0) {
            ArrayList list = new ArrayList();
            list.add(processed);
            return list;
        }

        ArrayList list = new ArrayList();
        if(row > 0) {
            list.addAll(mazepath(processed+"R",row-1,col));
        }
        if(col > 0) {
            list.addAll(mazepath(processed+"C",row,col-1));
        }

        return list;

    }
}
