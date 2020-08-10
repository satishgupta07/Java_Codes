package Problems_01;

public class LargestPrime {
    public static void main(String[] args) {
         int[] arr = {1, 13, 4, 5, 7};

        System.out.println(maxPrime(arr));
    }

    public static int maxPrime(int[] arr){
           int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
              if(checkprime(arr[i])){
                  if(max<arr[i]){
                      max = arr[i];
                  }
              }
        }
        return max;
    }

    public static boolean checkprime(int num){

        int i = 2;
        int flag = 0;
        while (i < num) {
            if (num % i == 0) {

                flag = 1;
                break;
            }
            i = i + 1;
        }

        if(flag==1){
            return false;
        }
        else{
            return true;
        }
    }
}
