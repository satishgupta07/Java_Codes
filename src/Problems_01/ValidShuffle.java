package Problems_01;

public class ValidShuffle {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        String str3 = "dabecf";

        System.out.println(isInterleaved(str1,str2,str3));
    }

     public static boolean isInterleaved (String str1, String str2, String str3) {
        int i = 0, j = 0, k = 0;

        while (k != str3.length()) {
            if (i<str1.length() && str1.charAt(i) == str3.charAt(k)){
                i++;
            }

            else if (j<str2.length() && str2.charAt(j) == str3.charAt(k)){
                j++;
            }

            else{
                return false;
            }

            k++;
        }

        if (i < str1.length() || j < str2.length()){
            return false;
        }

        return true;
    }
}
