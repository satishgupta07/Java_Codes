package Patterns;

import java.util.Scanner;

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();

        int i = 1;
        while(i <= row){
            int j = 1;
            while(j <= col){
                System.out.print("* ");
                j = j + 1;
            }
            System.out.println();
            i = i + 1 ;
        }
    }
}
