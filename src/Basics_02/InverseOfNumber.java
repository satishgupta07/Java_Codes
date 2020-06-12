package Basics_02;

public class InverseOfNumber {
    public static void main(String[] args) {
        int num = 32145 ;
        int inv = 0;
        int place = 1 ;

        while(num > 0){
            int rem = num % 10 ;
            inv = (int) (inv + (place)*Math.pow(10, rem-1));
            num = num/10;
            place = place + 1;
        }
        System.out.println(inv);
    }
}
