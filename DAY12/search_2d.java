//similar as a binary search of 1-d array
import java.util.*;
public class search_2d {
    public static boolean searchMatrix(int[][] arr, int target) {
        int n= arr.length;
        int m=arr[0].length;
        int low=0, high =(n*m)-1;
        while(low<=high){
            int mid=(low+high)/2;
            int row=mid/m;
            int col=mid%m;
            if(arr[row][col]==target) {
                System.out.println("("+row+","+col+")"); 
                return true;
            }
            else if(arr[row][col]<target) low =mid+1;
            else high= mid-1;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row:");
        int n=sc.nextInt();

        System.out.println("Enter the column:");
        int m=sc.nextInt();

        int arr[][]=new int[n][m];  

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter the target element:");
        int target = sc.nextInt();

        boolean result = searchMatrix(arr, target);
        System.out.println("Element found: " + result);
        sc.close();
    }
    
    
}
