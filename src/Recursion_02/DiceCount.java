package Recursion_02;

public class DiceCount {
    public static void main(String[] args) {
        System.out.println("Count : " + dicecount("",4));
    }

    public static int dicecount(String processed, int target) {
        if(target == 0){
            System.out.println(processed);
            return 1;
        }

        int count = 0;
        for (int i = 1; i<=6&&i<= target ; i++) {
            count += dicecount(processed+i,target-i);
        }
        return count;
    }

}
