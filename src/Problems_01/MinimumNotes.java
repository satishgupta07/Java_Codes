package Problems_01;

public class MinimumNotes {
    public static void main(String[] args) {
        int amount = 3868;
        countCurrency(amount);
    }

    public static void countCurrency(int amount)
    {
        int[] notes = new int[]{ 2000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
        int[] noteCounter = new int[notes.length];
        int count = 0;

        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
                amount = amount - noteCounter[i] * notes[i];
                count++;
            }
        }

        System.out.println("Minimum Number of Notes Required : "+count);
        System.out.println("Currency Count ->");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : "
                        + noteCounter[i]);
            }
        }
    }
}
