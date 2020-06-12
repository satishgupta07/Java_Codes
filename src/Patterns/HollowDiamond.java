package Patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        int n=7;
        int nst=n/2;
        int row=1;
        int nsp =1;
        while (row<=n){
            //star work
            for (int star = 1; star <= nst ; star++) {
                System.out.print("* ");
            }
            //space work
            for (int space = 1; space <=nsp ; space++) {
                System.out.print("  ");
            }
            //star work
            for (int star = 1; star <=nst ; star++) {
                System.out.print("* ");
            }
            //PREP
            System.out.println();
            if(row<=n/2){
                nsp=nsp+2;
                nst=nst-1;
            }
            else {
                nsp =nsp-2;
                nst=nst+1;
            }
            row++;
        }
    }
}
