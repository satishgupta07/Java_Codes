//        Take as input N, the size of array. Take N more inputs and store that in an
//        array.
//        Take as input “target”, a number. Write a function which prints all triplets
//        of numbers which sum to target.
//        E.g. For this array => 3, 1, 9, 7, 5, -1 and target of 9 the output is -1, 1 and
//                9; -1, 3 and 7; 1, 3 and 5.


package Arrays_02;

public class Triplet {
    public static void main(String[] args) {
         int ar[] = {3, 1, 9, 7, 5, -1};
         int target = 9;

         targetsum(target, ar);
    }

    public static void targetsum(int target,int ar[]){
        for(int i=0; i<ar.length; i++){
            for(int j=i+1; j<ar.length; j++) {
                for (int k = j+1; k < ar.length; k++) {
                    if (ar[i] + ar[j] +ar[k] == target) {
                        System.out.println("Triplets are :" +ar[i] + ", " + ar[j] +" and "+ar[k]);
                    }
                }
            }
        }

    }
}
