package Arrays_02;

public class SpiralPrint {
    public static void main(String[] args) {

        int ar[][]= { {1,2,3,4} , {6,7,8,9} , {11,12,13,14},{17,16,15,21}};

        spiralprint(ar);
    }

    public static void spiralprint(int ar[][]) {

        int top = 0;
        int bottom = ar.length - 1;
        int left = 0;
        int right = ar[0].length - 1;

        while(top <= bottom && left <= right) {
            for (int i = left; i <= right ; i++) {
                System.out.print(ar[top][i]+ ", ");
            }
            top = top + 1 ;

            for (int i = top ; i <= bottom ; i++) {
                System.out.print(ar[i][right]+ ", ");
            }
            right = right - 1 ;

            for (int i = right; i >= left ; i--) {
                System.out.print(ar[bottom][i]+ ", ");
            }
            bottom = bottom -1;

            for (int i = bottom ; i >= top ; i--) {
                System.out.print(ar[i][left]+ ", ");
            }
            left = left + 1;
        }
    }
}
