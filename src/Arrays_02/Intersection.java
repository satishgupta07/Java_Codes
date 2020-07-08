//  Take as input N, the size of array. Take N more inputs and store that in an
//   array.
//   Take N more inputs and store that in another array. Write a function which
//   returns the intersection of two arrays in an ArrayList of integers. Print the
//   ArrayList returned.
//   E.g. for the following arrays 1, 2, 3, 1, 2, 4, 1 and 2, 1, 3, 1, 5, 2, 2 the output
//   will be [1, 1, 2, 2, 3]

package Arrays_02;

import java.util.ArrayList;
import java.util.Arrays;

public class Intersection {
    public static void main(String[] args) {
        int ar1[]={1,2,3,1,2,4,1};
        int ar2[]={2,1,3,1,5,2,2};
        intersection(ar1,ar2);
    }

    public static void intersection(int ar1[],int ar2[]){
        Arrays.sort(ar1);
        Arrays.sort(ar2);

        int i=0;
        int j=0;

        ArrayList list = new ArrayList();
        while(i<ar1.length && j<ar2.length){
            if (ar1[i] < ar2[j]) {
                i++;
            }

            else if(ar1[i] > ar2[j]){
                j++;
            }
            else{
                list.add(ar1[i]);
                i++;
                j++;
            }
        }

        System.out.println(list);
    }
}
