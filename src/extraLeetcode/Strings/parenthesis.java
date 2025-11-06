package extraLeetcode.Strings;

import java.util.Stack;

public class parenthesis {
    public static void parenthesis(String s) {
        char[] arr = s.toCharArray();
        String s1="";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(' ) {
                if (!stack.empty()) {
                    s1+=arr[i];
                }
                stack.push(arr[i]);

            }
            else if (arr[i] == ')') {
                stack.pop();
                if (!stack.empty()) {
                    s1+=arr[i];
                }

            }
        }
        System.out.println(s1);
    }
    public static void main(String[] args) {
       String s = "(()())(())";
       parenthesis(s);
    }
}
