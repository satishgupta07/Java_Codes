package Basics_01;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n=6;
        int f=0;
        int s=1;
        while(n>=0){
            int t=f+s;
            System.out.println(f);
            f=s;
            s=t;
            n=n-1;
        }
    }
}
