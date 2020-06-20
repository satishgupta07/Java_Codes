package Basics_02;

public class NumSysConverter {
    public static void main(String[] args) {
        System.out.println(bin2dec(1011));
        System.out.println(any2dec(1010,2));
        System.out.println(dec2bin(15));
        System.out.println(dec2any(9,2));
        System.out.println(any2any(15,10,2));
    }

    public static int bin2dec(int bin){

        int deci=0;
        int place=1;

        while(bin>0){

            int r= bin % 10;
            deci=deci + r * place;
            bin=bin/10;
            place=place * 2;
        }

        return deci;
    }

    public static int any2dec(int any, int base){

        int deci=0;
        int place=1;

        while(any>0){

            int r= any % 10;
            deci=deci + r * place;
            any=any/10;
            place=place * base;
        }

        return deci;
    }

    public static int dec2bin(int deci){

        int bin=0;
        int place=1;

        while(deci>0){

            int r= deci % 2;
            bin=bin + r * place;
            deci=deci/2;
            place=place * 10;
        }

        return bin;
    }

    public static int dec2any(int deci,int base){

        int any=0;
        int place=1;

        while(deci>0){

            int r= deci % base;
            any=any + r * place;
            deci=deci/base;
            place=place * 10;
        }

        return any;
    }

    public static int any2any(int any, int base1, int base2){

        int deci= any2dec(any,base1);
        return  dec2any(deci,base2);
    }
}
