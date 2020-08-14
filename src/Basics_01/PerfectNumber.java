//Perfect Numbers are integers that are equal to the sum of all its divisors except that number itself.

package Basics_01;

public class PerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfect(28));

    }

    public static boolean isPerfect(int n){
        int sum = 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i==0) {
                if(i * i != n){
                    sum = sum + i + n / i;
                }
                else{
                    sum = sum + i;
                }
            }
        }

        if (sum == n && n != 1){
            return true;
        }
        return false;
    }
}
