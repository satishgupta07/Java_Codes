package Basics_02;

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int min = scn.nextInt();
        int max = scn.nextInt();
        int step = scn.nextInt();
        fahrtocel(min,max,step);
    }
    public static void fahrtocel(int min,int max,int step){

        while (min<=max){
            float c=((5f/9)*(min-32));
            System.out.println(min+" : "+c);
            min = min+step;
        }
    }
}
