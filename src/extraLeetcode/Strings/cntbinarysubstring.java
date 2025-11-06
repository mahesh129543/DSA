package extraLeetcode.Strings;

public class cntbinarysubstring {
    public static void substring(String s){
        char[] ch = s.toCharArray();
        int len = ch.length;
        for(int i=0;i<len;i++){
            for(int j=i;j<len;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(ch[k]);

                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        String a="00110011";
        substring(a);
    }
}
