package Arrays_01;

public class SubArray {
    public static void main(String[] args) {
//        int[] arr = { 10, -12, 3, -5, 11 };
         int[] arr = { 7, 2, 5, 1, 3, 9 };

//        subarray(arr);

//          subarraySum3Loops(arr);

        subarraySum2Loops(arr);
    }

    public static void subarray(int[] arr) {

        for (int si = 0; si < arr.length; si++) {

            for (int ei = si; ei < arr.length; ei++) {

                for (int k = si; k <= ei; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println();

            }
        }

    }

    public static void subarraySum3Loops(int[] arr) {

        for (int si = 0; si < arr.length; si++) {

            for (int ei = si; ei < arr.length; ei++) {

                int sum = 0;
                for (int k = si; k <= ei; k++) {
                    sum += arr[k];
                }
                System.out.println(sum);

            }
        }

    }

    public static void subarraySum2Loops(int[] arr) {

        int max = Integer.MIN_VALUE;

        for (int si = 0; si < arr.length; si++) {

            int sum = 0;

            for (int ei = si; ei < arr.length; ei++) {

                sum += arr[ei];

                if (sum > max) {
                    max = sum;
                }

                System.out.println(si + "-" + ei + ": " + sum);

            }
        }

        System.out.println("Max: " + max);

    }
}
