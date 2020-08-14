package Problems_02;

public class PrintSeriesPattern {
    public static void main(String[] args) {
         int n = 16;
         printNum(n);
    }

    public static void printNum(int n){
        System.out.print(n+" ");

        if(n<=0){
            return;
        }

        printNum(n-5);

        System.out.print(n+" ");
    }
}
