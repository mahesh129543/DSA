package extraLeetcode.Strings;

import java.util.Stack;

public class backspacestringcom {
    public static void backspaceString(String S, String t) {
        Stack<Character> s=new Stack<>();
        Stack<Character> s1=new Stack<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)=='#'){
                s.pop();
            }else if(S.charAt(i)!='#'){
                s.push( S.charAt(i));
            }


        }
        System.out.println(s.toString());
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)=='#'){
                s1.pop();
            }else if(t.charAt(i)!='#'){
                s1.push( t.charAt(i));
            }


        }

        System.out.println(s1.toString());
        if(s.size()!=s1.size()){
            System.out.println("false");
            return;
        }else {
            if(s1.isEmpty()){
                char top1=s.pop();
                char top2=s1.pop();
                if(top1!=top2){
                    System.out.println("false");
                    return ;
                }
            }

        }
        System.out.println("true");
    }

    public static void main(String[] args) {
        String s = "ab#c", t = "ad#c";
        backspaceString(s, t);
    }
}
