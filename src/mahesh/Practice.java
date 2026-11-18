package mahesh;
import java.util.*;

public class Practice {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("Enter the word");
//        String str = sc.next();
//        System.out.println(str);
//
//        sc.nextLine(); // 👈 consume leftover newline after next()
//
//        System.out.println("Enter the full line");
//        String str1 = sc.nextLine();
//        System.out.println(str1);
//
//
//        System.out.println("Enter the number");
//        int n=sc.nextInt();
//
//        int[] arr = new int[n];
//        for(int i=0;i<n;i++){
//            arr[i]=sc.nextInt();
//
//        }
//        System.out.println(Arrays.toString(arr));


//        System.out.println("n:");
//        int n = sc.nextInt();
//        System.out.println("m:");
//         int m = sc.nextInt();
//         int[][] arr = new int[n][m];
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j < m; j++){
//                 arr[i][j] = sc.nextInt();
//
//             }
//         }
//        System.out.println(Arrays.deepToString(arr));
//
//
//
//
//
//         System.out.println("a:");
//         int a=sc.nextInt();
//         int[] arr3 =new int[a];
//         for(int i=0;i<a;i++){
//             arr3[i]=sc.nextInt();
//
//         }
//        System.out.println(Arrays.toString(arr3));

        Scanner sc =new Scanner(System.in);

        System.out.println("n: ");
        int n=sc.nextInt();
        System.out.println("m:");
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();

            }
        }

        System.out.println(Arrays.deepToString(arr));







    }
}
