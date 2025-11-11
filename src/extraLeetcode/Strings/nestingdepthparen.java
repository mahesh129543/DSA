package extraLeetcode.Strings;

import java.util.Stack;

public class nestingdepthparen {
    public static void nestingdepthparen(String s) {
        int currentDepth = 0;
        int maxDepth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } else if (c == ')') {
                currentDepth--;
            }
        }

        System.out.println("Maximum nesting depth: " + maxDepth);
    }

public static void main(String[] args) {
   String s = "(1+(2*3)+((8)/4))+1";
   nestingdepthparen(s);

}
}
