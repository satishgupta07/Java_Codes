package Arrays;

public class Utils {
    public static void main(String[] args) {

        int ar[] = {4,7,2,9,4,6,3};

        System.out.println(ar[0]+" , "+ar[5]);
        swap(ar,0,5);
        System.out.println(ar[0]+" , "+ar[5]);

        System.out.println("***********************************************************");

        System.out.println(maxvalue(ar));

        System.out.println("***********************************************************");

        System.out.println(maxindex(ar,0,6));

    }

    public static void swap(int ar[],int i, int j){

        int temp= ar[i];
        ar[i]=ar[j];
        ar[j]=temp;
    }

    public static int maxvalue(int ar[]){

        int max=Integer.MIN_VALUE;                    // static int MAX_VALUE − This is a constant holding the maximum value an int can have, 2^31-1.
                                                      // static int MIN_VALUE − This is a constant holding the minimum value an int can have, -2^31
        for (int i = 0; i <ar.length ; i++) {

            if(ar[i]>max){
                max=ar[i];
            }
        }
        return max;
    }

    public static int maxindex(int ar[], int start, int end ){

        int max=start;

        for (int i = start; i <= end ; i++) {

            if(ar[i]>ar[max]){
                max = i;
            }
        }
        return max;
    }



}
