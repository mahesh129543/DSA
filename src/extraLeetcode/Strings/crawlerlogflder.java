package extraLeetcode.Strings;

import java.util.Stack;

public class crawlerlogflder {
    public static void crawlerlogflder(String[] str) {
        Stack<String> st = new Stack<String>();
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("./")){
                continue;
            }
            if(!st.isEmpty()&& str[i].equals("../")){
                st.pop();
            }
            else if(!str[i].equals("../")){
                st.push(str[i]);
            }
        }
        System.out.println(st.toString());
        System.out.println(st.size());

    }
    public static void main(String[] args) {
      String[]   logs = {"d1/","d2/","./","d3/","../","d31/"};
      String[] logs1 = {"d1/","../","../","../"};
      String[] logs2 = {"./","../","./"};
      crawlerlogflder(logs);
      crawlerlogflder(logs1);
      crawlerlogflder(logs2);
    }
}
