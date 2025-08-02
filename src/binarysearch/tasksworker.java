package binarysearch;

public class tasksworker {
    public static int binaryTask(int[] task,int k){
        int s=0;
        int e=33;
        int ans=0;
        while(s<=e){
            int mid=(s+e)/2;
            if(canDo(task,mid,k)){
                ans=mid;
                e=mid-1;
            }else{
                s=mid+1;
            }

        }return ans;
    }
    public static boolean canDo(int[] task,int mid,int k){
        int cnt=1;
        int time=0;
        for(int i=0;i<task.length;i++){
           if(time+task[i]<=mid){
               time+=task[i];
           }else{
                time=task[i];
               cnt++;
               if(cnt>k){
                   return false;
               }
           }

        }return true;

    }
    public static void main(String[] args) {
        int[] task={3,5,7,6,2,10};
        int k=3;
        System.out.println(binaryTask(task,k));


    }
}
