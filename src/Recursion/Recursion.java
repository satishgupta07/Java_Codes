package Recursion;

public class Recursion {
    public static void main(String[] args) {
//        PD(4);
//        PI(4);
          PDI(4);
    }

    public static void PD(int n) {
        if(n==0) {
            return;
        }
        System.out.println(n);
        PD(n-1);
    }

    public static void PI(int n) {
        if(n==0) {
            return;
        }
        PI(n-1);
        System.out.println(n);
    }

    public static void PDI(int n) {
        if(n==0) {
            return;
        }
        System.out.println("hello "+n);
        PDI(n-1);
        System.out.println("bye "+n);
    }
}
