package STRINGS;

public class VowelConsonantCount {
    public static void main(String[] args) {
        String str = "SatishKumarGupta";

        countVowels(str);
    }

    public static void countVowels(String str) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < str.length() ; i++) {
            if(isVowel(str.charAt(i))){
                vowelCount ++;
            }
            else {
                consonantCount ++;
            }
        }
        System.out.println("Vowel Count = "+vowelCount);
        System.out.println("Consonant Count = "+consonantCount);
    }

    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' );
    }
}
