package Basics_02;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeapYear = ((year%4==0) && (year % 100 != 0) || (year % 400 == 0));

        if(isLeapYear){
            System.out.println(year + " is leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
}

