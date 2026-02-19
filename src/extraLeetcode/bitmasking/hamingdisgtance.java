package extraLeetcode.bitmasking;

public class hamingdisgtance {
    public static void hamingdistance(int x,int y) {
        int cnt=0;
        int max=Math.max(x, y);
        while(max>0) {
            if((x&1)!=(y&1)) {
                cnt++;
            }
            y>>=1;
            max=max>>1;
            x=x>>1;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        int x=1;
        int y=4;
        int x1=8;
        int y1=4;
        hamingdistance(x,y);
        hamingdistance(x1,y1);
    }
}
