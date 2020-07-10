package Recursion_01;

public class LinearSearch {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        int k=3;

        System.out.println(linsearch(ar,k,0));
    }

    public static int linsearch(int[] ar, int k, int index){
        if(ar[index]==k){
            return index;
        }
        if( index ==ar.length) {
            return -1;
        }

        return linsearch(ar, k,index+1 );

    }
}
