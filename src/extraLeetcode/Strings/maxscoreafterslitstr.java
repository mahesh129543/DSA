package extraLeetcode.Strings;

import java.util.Arrays;

public class maxscoreafterslitstr {
    public static void maxscoreofthestr(String str) {
        int n = str.length();
        char[] ch = str.toCharArray();
        int ans=0;
        int[] presum = new int[n];
        presum[0] =(int) (ch[0]-'0');
        for (int i = 1; i < n; i++) {
            presum[i] = (int) (ch[i]-'0')+presum[i-1];
        }
        System.out.println(Arrays.toString(presum));
        int cnt=0;
        for (int i = 0; i < n; i++) {
            if(presum[i]==0){
                cnt++;
            }
        }
        if(cnt==0){
            ans=presum[n-1]-1;
        }else if(cnt==n){
            ans=cnt-1;
        }
        else{
            ans=presum[n-1]+cnt;
        }
        System.out.println(ans);

    }
    public static void main(String[] args) {
        String s = "011101";
        String s1 = "00111";
        String s2 = "1111";
        String s3 = "00000";
        maxscoreofthestr(s);
        maxscoreofthestr(s1);
        maxscoreofthestr(s2);
        maxscoreofthestr(s3);
    }
}
