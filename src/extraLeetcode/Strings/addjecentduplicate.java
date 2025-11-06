package extraLeetcode.Strings;

import java.util.Stack;

public class addjecentduplicate {
    public static void addjecentduplicate(String s) {
        char[] ch = s.toCharArray();
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < ch.length; i++) {
            if(!st.isEmpty() && st.peek() == ch[i]) {
                st.pop();
            }else{
                st.push(ch[i]);
            }


        }
        System.out.println(st);
        StringBuilder sb=new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        System.out.println(sb.reverse());

    }
    public static void main(String[] args) {
        String s = "abbaca";
        addjecentduplicate(s);
    }
}
