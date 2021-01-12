package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subset_02 {

    public static void main(String[] args) {

        int[] arr = {1,2,1};
//        subset(arr, 0, "", true);

        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        subset(arr, 0, ans, new ArrayList<Integer>(), true);
        System.out.println(ans);
    }

    public static void subset(int[] arr, int vidx, String ans, boolean flag) {

        if(vidx == arr.length) {
            System.out.println(ans);
            return;
        }

        if(flag == false && arr[vidx] == arr[vidx-1]) {
            subset(arr, vidx+1, ans, false);  //exclude
        }
        else {
            subset(arr, vidx+1, ans+arr[vidx], true);  //include
            subset(arr, vidx+1, ans, false);   //exclude
        }
    }

    public static void subset(int[] arr,int vidx, List<List<Integer>> ans, List<Integer> temp, boolean flag) {

        if(vidx == arr.length) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }

        if(flag == false && arr[vidx] == arr[vidx-1]) {
            subset(arr, vidx+1, ans, temp, false);  //exclude
        }
        else {
            temp.add(arr[vidx]);
            subset(arr, vidx+1, ans, temp, true);  //include
            temp.remove(temp.size()-1);
            subset(arr, vidx+1, ans, temp, false);   //exclude
        }
    }
}
