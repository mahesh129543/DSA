package extraLeetcode.Strings;

public class licensekeyformating {
    public static void licensekeyformating(String s,int k) {
        int n=s.length();
        StringBuilder sb=new StringBuilder();
        int cnt=0;
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)!='-'){
                sb.append(s.toUpperCase().charAt(i));
                cnt++;
                if(i<s.length()&&cnt==k){
                    sb.append('-');
                    cnt=0;
                }

            }
        }
        if(sb.length()>0 && sb.charAt(sb.length()-1)=='-'){
            sb.deleteCharAt(sb.length()-1);
        }
        System.out.println(sb.reverse().toString());
    }
    public static void main(String[] args) {
        String s = "5F3Z-2e-9-w";
        int k = 4;
        licensekeyformating(s, k);
    }
}
