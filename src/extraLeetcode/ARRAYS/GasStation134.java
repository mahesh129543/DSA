package extraLeetcode.ARRAYS;

public class GasStation134 {
    public static void gasStation134(int[] gas,int[] cost) {
        int n = gas.length;
        int totalgas=0;
        int totalcost=0;
        for(int i=0;i<n;i++) {
            totalgas+=gas[i];
            totalcost+=cost[i];
        }
        System.out.println(totalgas);
        System.out.println(totalcost);
        if(totalgas<totalcost) {
            System.out.println("impossible");
        }else{
            System.out.println("possible");
        }

        int currentgas=0;
        int startidx=0;
        for(int i=0;i<n;i++) {
            currentgas+=gas[i]-cost[i];

            if(currentgas<0) {
                startidx=i+1;
                currentgas=0;
            }
        }
        System.out.println(startidx);

    }
    public static void main(String[] args) {
        int[] gas={1,2,3,4,5};
        int[] cost={3,4,5,1,2,};
        gasStation134(gas,cost);
    }
}
