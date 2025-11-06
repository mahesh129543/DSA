package extraLeetcode.Strings;

public class genoddcntstr {
    public static void genoddcntstr(int n) {
        StringBuilder sb = new StringBuilder(n);
        if(n%2!=0){
            sb.append("a");
        }else{
            for(int i=1;i<=n-1;i++){
                sb.append("b");
            }
            sb.append("c");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        int n=4;
        genoddcntstr(n);

    }
}
