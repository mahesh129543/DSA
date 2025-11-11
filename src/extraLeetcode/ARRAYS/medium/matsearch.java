package extraLeetcode.ARRAYS.medium;

public class matsearch {
    public static void matsearchg(int[][] arr,int t){
        int n = arr.length;
        int m = arr[0].length;
        int i=0;
        int j=m-1;
        while(i<n && j>=0){
            if(arr[i][j]==t){
                System.out.println(arr[i][j]);
                return;
            }else if(arr[i][j]>t){
                j--;
            }else if(arr[i][j]<t){
                i++;

            }
        }

    }
    public static void matsearchmat(int[][] arr,int t){

        int n = arr.length;
        int m = arr[0].length;
        for(int i=0;i<n;i++){
            int s=0;
            int e=m-1;
            while(s<=e){
                int mid = (s+e)/2;
                if(arr[i][mid]==t){
                    System.out.println("Match found");

                    return;
                } else if(arr[i][mid]<t){
                    s=mid+1;

                }else{
                    e=mid-1;
                }

            }
        }
        System.out.println("No match found");
    }
    public static void matsearch(int[][] arr,int t){
        int n = arr.length;
        int m = arr[0].length;
        int s=0;
        int e=n*m-1;
        while(s<=e){
            int mid = (s+e)/2;
            int midval=arr[mid%n][mid/m];
            if(midval== t){
                System.out.println("Match found");
                return;
            }
            else if(midval>t){
                e=mid-1;

            }else{
                s=mid+1;
            }
        }
        System.out.println("Match not found");
    }
    public static void main(String[] args) {
        int [][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        matsearch(matrix,target);
        matsearchmat(matrix,target);
        matsearchg(matrix,target);
    }
}
