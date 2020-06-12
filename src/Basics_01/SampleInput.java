package Basics_01;

import java.util.Scanner;

public class SampleInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int sum = 0;

        while(sum >= 0){
            int n = s.nextInt();
            sum = sum + n;
            if(sum < 0){
                break;
            }
            System.out.println(n);
        }
    }
}
