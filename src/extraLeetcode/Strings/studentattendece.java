package extraLeetcode.Strings;

public class studentattendece {
    public static void studentattendece(String s) {
          int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                cnt++;
            }
        }
        if(cnt>2){
            System.out.println("false");
            return;
        }
        int cnnt=0;
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(i<s.length()&&c=='L'){
                cnnt++;
                if(cnnt==3){
                    System.out.println("false");
                    return;
                }

            }else{
                cnnt=0;
            }
        }
        System.out.println("true");

    }
    public static void main(String[] args) {
       String  s = "PPALLP";
       String s1 = "PPALLL";
       studentattendece(s);

       studentattendece(s1);
    }
}
