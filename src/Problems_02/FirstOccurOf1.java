package Problems_02;

public class FirstOccurOf1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,0,1,1};
        System.out.println(findOne(arr,0,arr.length));
    }

    public static int findOne(int arr[], int start, int end){
        if(start>end){
            return -1;
        }

        int mid = start + (end-start)/2;

        if(arr[mid]==1 && (mid==0 || arr[mid-1]==0)){
            return mid;
        }
        else if(arr[mid] == 0){
            return findOne(arr, mid+1, end);
        }
        else {
            return findOne(arr,start,mid-1);
        }
    }
}
