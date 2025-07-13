package Array2_2D;

public class twodarray {
    public static int rwoSum(int[][] arr){
        for(int i=0;i<arr.length;i++){
            int sum=0;
                for(int j=0;j<arr[i].length;j++){
                    sum=sum+arr[i][j];

                }
                System.out.println(sum);


        }return 0;
    }
    public static int largestcolSum(int[][] arr){
        int largest=Integer.MIN_VALUE;
        int bestcol=-1;
        for(int col=0;col<arr[0].length;col++){
            int sum=0;
            for(int row=0;row<arr.length;row++){
                sum=sum+arr[row][col];
                if(sum>largest){
                    largest=sum;
                    bestcol=col;

                }

            }
            System.out.println("sum of the  coloum in the row wise:"+largest);
        }
        System.out.print("the index of the best col : ");
        return bestcol;

    }
    public static int diagonalIteration( int[][] arr){
        System.out.println("this is the diagonal from (0,0)to (row-1 and col-1):");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(i==j){
                    System.out.println(arr[i][j]+" ");
                }
            }
        }
        System.out.println("another approach using the while loop");
        int x=0,y=0;
        while(x<arr.length && y<arr[x].length){
            System.out.println(arr[x][y]+" ");
            x++;
            y++;
        }
        System.out.println("this is the diagonal from (0,col-1)to (row-1 and col>=0):");

        int a=0;
        int b=arr[a].length-1;
        while(a<arr.length && b>=0){
            System.out.println(arr[a][b]+" ");
            a++;
            b--;
        }

        return 0;


    }
    public static int allDiagonal(int[][] arr,int m,int n){
        System.out.println("all diagonal");
        for(int j=0;j<n;j++){
            int x=0;
            int y=j;
            while(x<m && y>=0){
                System.out.println(arr[x][y]+" ");
                x++;
                y--;
            }
            System.out.println();
        }
        for(int i=1;i<m;i++){
            int x=i;
            int y=n-1;
            while(x<m&&y>=0){
                System.out.println(arr[x][y]+" ");
                x++;
                y--;

            }
            System.out.println();
        }



        return 0;

    }

    public static void main(String[] args) {
        int[][] arr={{1,2,3,4,17},
                     {5,6,7,8,18},
                     {9,10,11,12,19},
                    {13,14,15,16,20}};
        int m=arr.length;
        int n=arr[0].length;
        System.out.println("number of the row on zero base: "+m);
        System.out.println("number of the column on zero base: "+n);
        System.out.println(rwoSum(arr));
        System.out.println(largestcolSum(arr));
        System.out.println(diagonalIteration(arr));
        allDiagonal(arr,m,n);


    }
}
