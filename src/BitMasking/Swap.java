package BitMasking;

public class Swap {
    public static void main(String[] args) {
        int x=3;
        int y=4;
        swap(x,y);
    }

    public static void swap(int x,int y){
        x = x^y;
        y=x^y;
        x=x^y;
        System.out.println(x+","+y);
    }
}
