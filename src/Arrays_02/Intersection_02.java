package Arrays_02;

import java.util.HashMap;

public class Intersection_02 {
    public static void main(String[] args) {
        int ar1[]={1,2,3,1,2,4,1};
        int ar2[]={2,1,3,1,5,2,2};
        intersection(ar1,ar2);
    }

    public static void intersection(int[] arr1, int[] arr2){
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i: arr1) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else {
                map.put(i,1);
            }
        }
        for (int j : arr2) {
            if(map.containsKey(j) && map.get(j) != 0){
                System.out.print(j+",");
                map.put(j,map.get(j)-1);
            }
        }
    }
}
