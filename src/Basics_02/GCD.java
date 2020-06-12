package Basics_02;

public class GCD {
    public static void main(String[] args) {
        int N1=10;
        int N2=15;
        System.out.println(hcf(N1, N2));
    }

    public static int hcf(int N1, int N2){
        int gcd=1;
        for(int i=1; i<=N1 && i<=N2 ; i++){
            if(N1%i==0 && N2%i==0){
                gcd=i;
            }
        }
        return gcd;
    }

}
