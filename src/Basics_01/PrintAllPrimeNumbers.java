package Basics_01;

public class PrintAllPrimeNumbers {
    public static void main(String[] args) {
        int num=50;

        for (int n = 2; n <= num ; n++) {
            int flag =0;
            for (int i = 2; i <n ; i++) {
                if(n%i==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                System.out.println(n);
            }
        }
    }
}
