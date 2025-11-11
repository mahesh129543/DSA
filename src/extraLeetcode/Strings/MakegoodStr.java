package extraLeetcode.Strings;

import java.util.Stack;



public class MakegoodStr {
    public static void makeGoodStr(String str) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if(!stack.isEmpty() && (stack.peek() == str.charAt(i)+32||stack.peek() == str.charAt(i)-32) ){
                stack.pop();
            }
            else {
                stack.push(str.charAt(i));

            }


        }
        System.out.println(stack);
        while(!stack.isEmpty()) {
            sb.append(stack.pop());

        }
        System.out.println(sb.reverse().toString());

    }
    public static void main(String[] args) {
       String s = "abBAcC";
       String s1 = "leEeetcode";

       makeGoodStr(s);
       makeGoodStr(s1);
    }
}
