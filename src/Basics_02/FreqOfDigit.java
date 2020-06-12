package Basics_02;

public class FreqOfDigit {
    public static void main(String[] args) {

        int n=85700455;
        char d=5;
        System.out.println(freqofdigit(n,d));
    }

    public static int freqofdigit(int n, int d) {
        int c=0;
        while(n>0){
            if(n%10==d){
                c++;
            }
            n = n/10;
        }
        return c;
    }
}
