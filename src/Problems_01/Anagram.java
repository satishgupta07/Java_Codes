package Problems_01;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "cde";

        System.out.println(charDeletion(str1,str2));
    }

    public static int charDeletion(String str1, String str2){
        int[] count1 = new int[26];
        int[] count2 = new int[26];

        for (int i = 0; i <str1.length() ; i++) {
            count1[str1.charAt(i)-'a']++;
        }

        for (int i = 0; i <str2.length() ; i++) {
            count2[str2.charAt(i)-'a']++;
        }

        int result = 0;
        for (int i = 0; i <26 ; i++) {
            result += Math.abs(count1[i]-count2[i]);
        }

        return result;
    }
}
