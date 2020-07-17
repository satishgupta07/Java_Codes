package Recursion_03;

public class Keypad {
    public static void main(String[] args) {
        keypad("","12");
    }

    public static void keypad(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        int digit = unprocessed.charAt(0) -'0';
        unprocessed = unprocessed.substring(1);
        for (int i =3*(digit-1); i <digit*3 ; i++) {
            if(i==26){
                continue;
            }
            char ch = (char) (i+'a');
            keypad(processed+ch,unprocessed);
        }
    }
}
