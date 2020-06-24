package Arrays_01;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int ar[] = {2, 3, 4, 6, 7, 9, 12, 15, 17, 18};

        Scanner s = new Scanner(System.in);
        int element = s.nextInt();

        int index = binsearch(ar, element);

        if (index == -1){
            System.out.println("Element not found");
        }
        else {
            System.out.println("Element found at index " + index);
        }
    }
    public static int binsearch(int ar[], int element){
        int start = 0;
        int end = ar.length-1;

        while (start <= end){
            int mid = (start+end)/2;
            if (ar[mid] == element) {
                return mid;
            }
            else if(ar[mid] < element){
                start = mid+1;
            }
            else {
                end = mid -1;
            }

        }
        return -1;
    }
}
