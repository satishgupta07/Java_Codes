package Basics_01;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 81;
        checkperfectsq(n);
    }

    public static void checkperfectsq(int n){
        for (int i = 1; i < n/5 ; i++) {
            if(i*i == n){
                System.out.println("Given number is perfect square of "+i);
                return;
            }
        }
        System.out.println("Not a perfect square ");
    }
}
