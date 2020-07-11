package BitMasking;

public class SetBits {
    public static void main(String[] args) {
        System.out.println(countset(5));
    }

    public static int countset(int n){
        int count=0;
        while (n>0){
            if((n&1)==1){
                count++;
            }
            n=n>>1;
        }
        return count;
    }
}
