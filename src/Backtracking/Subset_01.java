package Backtracking;

import java.util.ArrayList;

public class Subset_01 {
    public static void main(String[] args) {

        int[] arr = {1,2,3};
//        subset(arr,0,"");
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        subset(arr,0,new ArrayList<>(), ans);
        System.out.println(ans);
    }

    public static void subset(int[] arr, int vidx, String ans) {
        if(vidx == arr.length) {
            System.out.println(ans);
            return;
        }

        subset(arr, vidx+1, ans);   // exclude
        subset(arr, vidx+1, ans+arr[vidx]);  // include
    }

    public static void subset(int[] arr, int vidx, ArrayList<Integer> temp, ArrayList<ArrayList<Integer>> ans) {

        if(vidx == arr.length) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        temp.add(arr[vidx]);
        subset(arr, vidx+1, temp, ans);  //include
        temp.remove(temp.size()-1);
        subset(arr, vidx+1, temp, ans);  //exclude
    }
}
