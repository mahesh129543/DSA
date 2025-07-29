package primenumber;

public class primefac {
    public static void main(String[] args) {
        int n=48;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                int cnt=0;
                while(n%i==0){
                    n=n/i;
                    cnt++;
                }
                System.out.println(i+","+cnt);
            }

        }
    }
}
