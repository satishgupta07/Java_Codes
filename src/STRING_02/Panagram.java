package STRING_02;

public class Panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";

        System.out.println(isPanagram(str.toLowerCase()));
    }

    public static boolean isPanagram(String str) {
        if(str.length()<26){
            return false;
        }
        else{
            for(char ch='a';ch<='z';ch++){
                if(str.indexOf(ch)<0){                        // The indexOf() method returns the position of the first occurrence of specified character(s) in a string.
                    return false;
                }
            }
        }
        return true;
    }

}
