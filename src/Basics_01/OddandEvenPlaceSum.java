package Basics_01;

public class OddandEvenPlaceSum {
    public static void main(String[] args) {
        int num = 54873;
        int OddSum = 0;
        int EvenSum = 0;
        int flag = 1;

        while(num > 0){
            if(flag % 2 == 0){
                EvenSum += num % 10 ;
                num = num/10;
            }
            else {
                OddSum += num % 10;
                num = num/10;
            }
            flag = flag +1;
        }

        System.out.println("Sum of odd placed digits = " + OddSum);
        System.out.println("Sum of even placed digits = " + EvenSum);
    }
}
