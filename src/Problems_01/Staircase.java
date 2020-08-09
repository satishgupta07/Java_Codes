package Problems_01;

public class Staircase {
    public static void main(String[] args) {
        System.out.println(stairs(5));

        int n=4;
        Integer stairs[]= new Integer[n+1];
        System.out.println(stairsDP(n,stairs));
    }

    public static int stairs(int n){
        if(n<0){
            return 0;
        }
        if(n==0 || n==1){
            return 1;
        }
        return stairs(n-1)+stairs(n-2);
    }

    public static int stairsDP(int n, Integer[] stairs) {
        stairs[0] = 1;
        stairs[1] = 1;

        for(int i=2; i<=n; i++){
            stairs[i] = stairs[i-1] + stairs[i-2];
        }
        return stairs[n];
    }
}
