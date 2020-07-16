package BitMasking;

public class SetBits_02 {
    public static void main(String[] args) {
        System.out.println(countBitFast(5));
    }

    public static int countBitFast(int n){
        int count = 0 ;
        while(n > 0){
            count++;
            n = n & (n-1);
        }
        return count;
    }
}
