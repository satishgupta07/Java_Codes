package STRINGS;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args) {
        String str = "{()}";

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if(st.empty()){
                st.push(ch);
            }
            else if(ch=='{'||ch=='('||ch=='['){
                st.push(ch);
            }
            else if( (ch=='}'&&st.peek()=='{') || (ch==']'&&st.peek()=='[') || (ch==')'&&st.peek()=='(') ){
                st.pop();
            }
        }
        if(st.empty()){
            System.out.println("Given String is well formed");
        }
        else {
            System.out.println("Given String is not well formed");
        }
    }
}
