package Arrays_01;

public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {1,5,4,7,3,9,6,2};

        for (int i = 0; i < arr.length ; i++) {
            int j;
            for (j = i+1; j < arr.length ; j++) {
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==arr.length){
                System.out.println(arr[i]);
            }
        }
    }
}
