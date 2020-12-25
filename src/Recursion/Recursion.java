package Recursion;

public class Recursion {
    public static void main(String[] args) {
//        PD(4);
//        PI(4);
//          PDI(4);
        TOH(3,"Source", "Destination", "Helper");
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

    public static void TOH(int n, String src, String dst, String helper) {
        if(n==0) {
            return;
        }
        TOH(n-1, src, helper, dst);
        System.out.println("Move "+n+" disk from "+src+" to "+dst);
        TOH(n-1,helper, dst, src);
    }
}
