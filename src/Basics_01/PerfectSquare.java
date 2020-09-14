package Basics_01;

public class PerfectSquare {
    public static void main(String[] args) {
        int n = 81;

        if (isPerfectSquare(n)) {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }

    public static boolean isPerfectSquare(int n)
    {
        for (int i = 1; i * i <= n; i++) {

            // If (i * i = n)
            if ((n % i == 0) && (n / i == i)) {
                return true;
            }
        }
        return false;
    }
}
