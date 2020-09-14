package Basics_01;

public class OddandEvenPlaceSum {
    public static void main(String[] args) {
        int num = 234567;
        getSum(num);
    }
//
//    public static int reverse(int n) {
//        int rev = 0;
//        while (n != 0) {
//            rev = (rev * 10) + (n % 10);
//            n /= 10;
//        }
//        return rev;
//    }
//
//    public static void getSum(int num){
//        num = reverse(num);
//        int OddSum = 0;
//        int EvenSum = 0;
//        boolean odd = true;
//        while(num > 0){
//            if(odd){
//                OddSum += num % 10;
//            }
//            else {
//                EvenSum += num % 10 ;
//            }
//
//            num = num/10;
//            odd = !odd;
//        }
//
//        System.out.println("Sum of odd placed digits = " + OddSum);
//        System.out.println("Sum of even placed digits = " + EvenSum);
//    }

    public static void getSum(int n){
        int oddSum = 0;
        int evenSum = 0;

        boolean isOdd = (n % 2 == 1) ? true : false ;

        while (n>0){
            if(isOdd){
                oddSum += n%10;
            }
            else{
                evenSum += n%10;
            }
            isOdd = !isOdd;
            n = n/10;
        }
        System.out.println("Sum of odd placed digits = " + oddSum);
        System.out.println("Sum of even placed digits = " + evenSum);

    }
}
