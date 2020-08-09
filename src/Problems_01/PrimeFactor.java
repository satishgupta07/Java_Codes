package Problems_01;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class PrimeFactor {
    public static void main(String[] args) {
        int num = 315;

        primefactor(num);
    }

    public static void primefactor(int num) {
        HashSet<Integer> hashSet = new LinkedHashSet<>();

        for (int i = 2; i <=num ; i++) {
            while (num%i==0){
                hashSet.add(i);
                num = num/i;
            }
        }

        int max_prime = 0;
        int sum = 0;

        for (Integer integer : hashSet) {
            System.out.println(integer);
            sum = sum + integer;

            if(integer>max_prime){
                max_prime = integer;
            }
        }
        System.out.println("Max Prime Factor = "+max_prime);
        System.out.println("Prime Factors Sum = "+sum);
    }
}
