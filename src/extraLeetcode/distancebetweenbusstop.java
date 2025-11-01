package extraLeetcode;

public class distancebetweenbusstop {
    public static void distancebitween(int[] arr,int s,int d){
        int total=0;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            total+=arr[i];

        }
        System.out.println(total);
        if(s==d){
            System.out.println("0");
        }

        if(s>d){
            for(int i=s-1;i>=d;i--){
                sum+=arr[i];

            }
        }else if(s<d){
            for(int i=s;i<d;i++){
                sum+=arr[i];
            }
        }
        System.out.println(sum);
        int sum1=total-sum;
        int mindis=Math.min(sum1,sum);
        System.out.println(mindis);






//        int n=arr.length;
//        int sum=0;
//        for(int i=0;i<d;i++){
//            sum+=arr[i];
//
//        }
//        System.out.println(sum);
//        int sum1=0;
//        for(int i=d;i<n;i++){
//           sum1+=arr[i];
//
//        }
//        System.out.println(sum1);
//        System.out.println("minimun distatnce betwwen to stoop is "+Math.min(sum,sum1));

    }
    public static void main(String[] args) {
     int[]   distance = {7,10,1,12,11,14,5,0};
     int start = 7;
     int destination = 2;
     distancebitween(distance,start,destination);
    }
}
