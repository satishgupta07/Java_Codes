package Basics_02;

import java.util.Scanner;

public class MirrorInverse {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int inv= inverse(n);

        if(inv==n){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
    public static int inverse(int n){

        int inv=0;
        int place=1;

        while(n>0){

            int r = n%10;
            n=n/10;
            inv = inv + (int)(place*Math.pow(10,r-1));
            place=place+1;
        }

        return inv;
    }

}
