package extraLeetcode.Strings;

public class cosicutivechar {
    public static void cosicutivechar(String s) {
        int n = s.length();
        char[] ch = new char[n];
        int premax=0;
        int cnt=1;
        for(int i=0;i<n-1;i++) {
            if(s.charAt(i)!=s.charAt(i+1)) {
                premax=Math.max(premax,cnt);
                cnt=1;
            }else{
                cnt++;
            }

        }
        System.out.println(premax);
    }
    public static void main(String[] args) {
       String s = "abbcccddddeeeeedcba";
       cosicutivechar(s);
    }
}
