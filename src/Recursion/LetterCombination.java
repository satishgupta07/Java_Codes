package Recursion;

public class LetterCombination {
    public static void main(String[] args) {
        letterCombination("23","");
    }

    public static void letterCombination(String ques, String ans) {
        if(ques.length()==0) {
            System.out.println(ans);
            return;
        }
        char ch = ques.charAt(0);
        String roq = ques.substring(1);

        String code = getCode(ch);
        for(int i=0; i<code.length(); i++) {
            letterCombination(roq, ans+code.charAt(i));
        }
    }

    public static String getCode(char ch) {
        if(ch=='2') {
            return "abc";
        }
        else if(ch=='3') {
            return "def";
        }
        else if(ch=='4') {
            return "ghi";
        }
        else if(ch=='5') {
            return "jkl";
        }
        else if(ch=='6') {
            return "mno";
        }
        else if(ch=='7') {
            return "pqrs";
        }
        else if(ch=='8') {
            return "tuv";
        }
        else if(ch=='9') {
            return "wxyz";
        }
        else {
            return "";
        }
    }
}
