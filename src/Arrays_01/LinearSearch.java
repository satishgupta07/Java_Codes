package Arrays_01;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
          int[] ar = {2, 4, 9, 1, 8, 3, 6} ;

          Scanner s = new Scanner(System.in);
          int element = s.nextInt();

        int index = linearsearch(ar, element);

        if (index == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+index);
        }
    }

    public static int linearsearch(int ar[], int element){
        for (int i = 0; i < ar.length ; i++) {
            if(ar[i] == element ){
                return i;
            }
        }
        return -1;
    }
}
