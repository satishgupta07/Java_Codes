package Problems_01;

public class MaximumSumContiguousSubarray {
    public static void main(String[] args) {
        int[] arr = {10,-20,35,40,10,-10,-50};

        System.out.println(maxSubArraySum(arr));
    }

    public static int maxSubArraySum(int[] arr){
        int max = arr[0];
        int maxsofar = arr[0];

        for (int i = 1; i < arr.length ; i++) {
            maxsofar = Math.max(arr[i],maxsofar+arr[i]);

            if(maxsofar>max){
                max = maxsofar;
            }
        }
        return max;
    }
}
