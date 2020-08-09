package Problems_01;

public class TrappingRainWaterProblem {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,0,3,1,0,3};

        System.out.println(trappedwater(arr));
    }

    public static int trappedwater(int[] arr){
        int water = 0;

        for (int i = 1; i < arr.length-1 ; i++) {
            int lmax = arr[i];
            for (int j = 0; j <i ; j++) {
                if(arr[j]>lmax){
                    lmax=arr[j];
                }
            }
            int rmax = arr[i];
            for (int j = i+1; j <arr.length; j++) {
                if(arr[j]>rmax){
                    rmax=arr[j];
                }
            }
            water += Math.min(lmax,rmax) - arr[i];
        }

        return water;
    }
}
