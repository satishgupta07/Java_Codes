//        Take as input N, the size of array. Take N more inputs and store that in an array.
//        Take as input M, a number. Write a recursive function which returns the last index
//        at which M is found in the array and -1 if M is not found anywhere. Print the value returned.

package Recursion_01;

public class LastIndex {
    public static void main(String[] args) {
        int ar[] = {2,8,1,4,7,5,3,9,4,7,2,3,9};
        int M = 3;

        System.out.println(lastindex(ar,M,0));
    }

    public static int lastindex(int ar[], int M, int i) {
        if(i == ar.length){
            return -1;
        }
        int index = lastindex(ar, M,i+1);
        if(index==-1){
            if(ar[i]== M){
                return i;
            }
            else{
                return -1;
            }
        }
        else {
            return index;
        }

    }
}
