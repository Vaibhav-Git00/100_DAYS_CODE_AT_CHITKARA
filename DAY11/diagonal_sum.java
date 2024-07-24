import java.util.Scanner;

public class diagonal_sum {
    public static int diagonalSum(int[][] mat) {
        int sum=0;
        int n=mat.length;
        for(int i=0;i<n;i++){
            sum += mat[i][i] + mat[i][n-i-1];
        }
        if(n%2==1) sum -= mat[n/2][n/2];    //if n is odd , then center repeated item is remove
        return sum;
    } 
       
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];       //diagonal sum is always valid for square pattern
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(diagonalSum(arr));
        sc.close();
    }
}
