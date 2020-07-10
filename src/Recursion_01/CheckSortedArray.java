package Recursion_01;

public class CheckSortedArray {
    public static void main(String[] args) {
        int ar[]={1,2,3,4,5};
        System.out.println(check(ar,0));
    }

    public static boolean check(int ar[],int i){
        if(i==ar.length-1){
            return true;
        }
        if(ar[i]>ar[i+1]){
            return false;
        }

        return check(ar,i+1);
    }
}
