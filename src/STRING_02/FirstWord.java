package STRING_02;

public class FirstWord {
    public static void main(String[] args) {
        String str = "Learn with Krishna Sandeep";

        splitWord(str);
    }

    public static void splitWord(String str) {
        String[] words = str.split(" ");

        for (int i = 0; i < words.length ; i++) {
            String s = words[i];
            System.out.println(s.charAt(0));
        }
    }
}
